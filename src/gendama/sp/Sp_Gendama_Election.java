package gendama.sp;

import static common.Common.*;
import static common.constant.HtmlConstants.*;
import static common.constant.PointConstants.*;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import gendama.Sp_Gendama;

/**
 * =====================================================================================================================
 * げん玉(携帯)：クマクマ総選挙
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Sp_Gendama_Election extends Sp_Gendama {
	/** 「daily-points」 */
	private static final String C_D_P = "daily-chance__list";
	/** 「クマクマ総選挙URL」 */
	String election_url;
	/** 「獲得ポイント」 */
	int point_count = 0;
	/** 「再スタートフラグ」 */
	Boolean restart_flag = Boolean.FALSE;
	/** 「アンケート件数」 */
	int enquete_count = 0;

	/**
	 * コンストラクタ
	 */
	public Sp_Gendama_Election() {
		// 「CMくじ」
		driver.get(SP_GENDAMA_CM_URL);
	}

	/**
	 * =================================================================================================================
	 * (携帯)クマクマ総選挙
	 * =================================================================================================================
	 *
	 * @return int point_couont 獲得済みポイント
	 *
	 * @author kimC
	 *
	 */
	public Integer execute() {
		try {
			// 「クマクマ総選挙URL」取得する
			election_url = driver.findElement(By.className(C_D_P)).findElements(By.tagName(T_A)).get(3)
					.getAttribute(A_HREF);
			if (StringUtils.isNoneEmpty(election_url)) {
				// 「クマクマ総選挙画面」
				driver.get(election_url);
				// 「さっそく投票を始める！」
				click(getByClass("start__button"));
				// アンケート件数
				enquete_count = driver.findElement(By.className("select__list")).findElements(By.tagName(T_A)).size();
				if (enquete_count < 1) {
					driver.quit();
					return point_count;
				}
				// 「投票画面」
				driver.findElement(By.className("select__list")).findElements(By.tagName(T_A)).get(0).click();
				// 投票処理をする
				for (int i = 0; i < 500; i++) {
					start();
					if (restart_flag) {
						// 「クマクマ総選挙画面」
						driver.get(election_url);
						// 「アンケート開始」
						click(getByClass("start__button"));
						// アンケート件数
						enquete_count = driver.findElement(By.className("select__list")).findElements(By.tagName(T_A)).size();
						if (enquete_count < 1) {
							driver.quit();
							return point_count;
						}
						// 「アンケート画面」
						driver.findElement(By.className("select__list")).findElements(By.tagName(T_A)).get(0).click();
					}
					// 獲得ポイントカウント
					point_count += 1;
				}
			} else {
				System.out.println("【エラー】：クマクマ総選挙URL取得失敗");
			}
			driver.quit();
			return point_count;
		} catch (Exception e) {
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
			System.out.println("【エラー】：選挙スタート失敗");
			System.out.println("【エラー】：クマクマ総選挙遷移再スタート");
			point_count -= 1;
			restart_flag = Boolean.TRUE;
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

		} catch (Exception e) {
			System.out.println("=====選挙再スタート失敗");
			System.out.println("...");
			System.out.println("...");
			System.out.println("...");
		}
	}

}
