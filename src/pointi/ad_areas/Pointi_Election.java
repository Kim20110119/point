package pointi.ad_areas;

import static common.Common.*;
import static common.constant.HtmlConstants.*;
import static common.constant.PointConstants.*;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import pointi.Pc_Pointi;

/**
 * =====================================================================================================================
 * ポイントインカム：クマクマ総選挙
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pointi_Election extends Pc_Pointi {
	/** 「daily-points」 */
	private static final String C_D_P = "daily-points";
	/** 「クマクマ総選挙URL」 */
	String election_url;
	/** 「獲得ポイント」 */
	int point_count = 0;
	/** 「再スタートフラグ」 */
	Boolean restart_flag = Boolean.FALSE;
	/** 「アンケート件数」 */
	int enquete_count = 0;
	/** 開始Index */
	int start = 0;
	/** 終了Index */
	int end = 200;

	/**
	 * コンストラクタ
	 */
	public Pointi_Election() {

	}

	/**
	 * =================================================================================================================
	 * クマクマ総選挙
	 * =================================================================================================================
	 *
	 * @return int point_couont 獲得済みポイント
	 *
	 * @author kimC
	 *
	 */
	public Integer execute() {
		try{
			// 「CMくじ」
			driver.get(POINTI_CF_URL);
			// 「クマクマ総選挙URL」取得する
			election_url = driver.findElement(By.className(C_D_P)).findElements(By.tagName(T_A)).get(2).getAttribute(A_HREF);
			if (StringUtils.isNoneEmpty(election_url)) {
				// 「クマクマ総選挙画面」
				driver.get(election_url);
				// 「さっそく投票を始める！」
				click(getByClass("start__button"));
				// アンケート件数
				enquete_count = driver.findElement(By.className("select__list")).findElements(By.tagName(T_A)).size();
				if(enquete_count < 1){
					driver.quit();
					return point_count;
				}
				// 「投票画面」
				driver.findElement(By.className("select__list")).findElements(By.tagName(T_A)).get(0).click();
				// 投票処理をする
				for (int i = start; i < end; i++) {
					start();
					if(restart_flag){
						// アンケート件数
						enquete_count = driver.findElement(By.className("select__list")).findElements(By.tagName(T_A)).size();
						if(enquete_count < 1){
							driver.quit();
							return point_count;
						}
					}
					// 獲得ポイントカウント
					point_count += 1;
				}
			}else{
				System.out.println("【エラー】：クマクマ調査団URL取得失敗");
			}
			driver.quit();
			return point_count;
		}catch(Exception e){
			driver.quit();
			System.out.println("【エラー】：クマクマ総選挙失敗");
			return point_count;
		}
	}

	/**
	 * =================================================================================================================
	 * 投票スタート
	 * =================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public void start() {
		try {
			// 「投票選択肢カウント」
			int choice_count = getSize(getByXpath("label", "class", "radio"));
			// 「投票選択肢」クリック
			clickByIndex(getByXpath("label", "class", "radio"), int_random(choice_count));
			// 1秒待ち
			sleep(1000);
			// 「次へ」ボタン
			driver.findElement(By.className("button--answer")).click();
			// 1秒待ち
			sleep(1000);
			// 「次の投票へ」
			driver.findElement(By.className("button__box")).findElements(By.tagName(T_A)).get(0).click();
			// 1秒待ち
			sleep(1000);
		} catch (Exception e) {
			System.out.println("【エラー】：投票スタート失敗");
			System.out.println("【エラー】：クマクマ調査団遷移再スタート");
			point_count -= 1;
			restart();
		}
	}

	/**
	 * =================================================================================================================
	 * 投票再スタート
	 * =================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public void restart() {
		try {
			// 「クマクマ調査団画面」
			driver.get(election_url);
			// 「さっそく投票を始める！」
			click(getByClass("start__button"));
			// アンケート件数
			enquete_count = driver.findElement(By.className("select__list")).findElements(By.tagName(T_A)).size();
			// 「投票画面」
			driver.findElement(By.className("select__list")).findElements(By.tagName(T_A)).get(0).click();
		} catch (Exception e) {
			System.out.println("【エラー】：投票再スタート失敗");
		}
	}

}
