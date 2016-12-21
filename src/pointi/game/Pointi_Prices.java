package pointi.game;

import static common.Common.*;
import static common.constant.HtmlConstants.*;
import static common.constant.PointConstants.*;

import org.openqa.selenium.By;

import pointi.Pc_Pointi;

/**
 * =====================================================================================================================
 * ポイントインカム：プライス調査隊
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pointi_Prices extends Pc_Pointi {
	/** 「btn-area」 */
	private static final String C_B_A = "btn-area";
	/** 「クマクマ総選挙URL」 */
	String election_url;
	/** 「獲得ポイント」 */
	int point_count = 0;
	/** 「再スタートフラグ」 */
	Boolean restart_flag = Boolean.FALSE;
	/** 「アンケート件数」 */
	int enquete_count = 0;
	String t_url = "http://price-game.pointi.jp//game/check?id=";
	/** 「開始番号」 */
	int start = 312;
	/** 「終了番号」 */
	int end = 317;

	/**
	 * コンストラクタ
	 */
	public Pointi_Prices() {
		// 「ゲーム」
		driver.get(POINTI_PRICES_URL);
	}

	/**
	 * =================================================================================================================
	 * プライス調査隊
	 * =================================================================================================================
	 *
	 * @return int point_couont 獲得済みポイント
	 *
	 * @author kimC
	 *
	 */
	public Integer execute() {
		try{

//			click(By.partialLinkText("調査開始！"));

			int start_count = driver.findElements(By.partialLinkText("調査開始！")).size();
			for(int start_i = 0; start_i < start_count; start_i++ ){
				driver.findElements(By.partialLinkText("調査開始！")).get(start_i).click();
				for(int start_j = 0; start_j < 6; start_j++){
					int start_check_count = driver.findElement(getByClass(C_B_A)).findElements(getByTag(T_A)).size();
					driver.findElement(getByClass(C_B_A)).findElements(getByTag(T_A)).get(int_random(start_check_count)).click();
					// 2秒待ち
					sleep(2000);
					System.out.println("選択");
					// 2秒待ち
					sleep(2000);
					click(By.partialLinkText("決定"));
					System.out.println("決定");
					// 3秒待ち
					sleep(3000);
					click(By.partialLinkText("次の調査へ！"));
				}
				click(By.partialLinkText("結果を見る！"));
				click(By.partialLinkText("スタンプGET!"));
			}
			int ing_count = driver.findElements(By.partialLinkText("調査中！")).size();
			for(int ing_i = 0; ing_i < ing_count; ing_i++ ){
				// 調査中
				driver.findElements(By.partialLinkText("調査中！")).get(ing_i).click();
				for(int ing_j = 0; ing_j < 6; ing_j++){
					// 2秒待ち
					sleep(3000);
					int img_check_count = driver.findElement(getByClass(C_B_A)).findElements(getByTag(T_A)).size();
					if(img_check_count < 1){
						break;
					}
					driver.findElement(getByClass(C_B_A)).findElements(getByTag(T_A)).get(int_random(img_check_count)).click();
					// 2秒待ち
					sleep(2000);
					click(By.partialLinkText("決定"));
					// 3秒待ち
					sleep(3000);
					click(By.partialLinkText("次の調査へ"));
					System.out.println("次の調査へ");
				}
				click(By.partialLinkText("結果を見る！"));
				click(By.partialLinkText("スタンプGET!"));
			}
			driver.quit();
			return point_count;
		}catch(Exception e){
			driver.quit();
			System.out.println("===プライス調査隊失敗");
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
			System.out.println("=====調査スタート失敗");
			System.out.println("=====プライス調査隊再スタート");
			System.out.println("...");
			System.out.println("...");
			System.out.println("...");
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
			// 「プライス調査隊画面」
			driver.get(election_url);
			// 「さっそく投票を始める！」
			click(getByClass("start__button"));
			// アンケート件数
			enquete_count = driver.findElement(By.className("select__list")).findElements(By.tagName(T_A)).size();
			// 「調査画面」
			driver.findElement(By.className("select__list")).findElements(By.tagName(T_A)).get(0).click();
		} catch (Exception e) {
			System.out.println("=====プライス調査再スタート失敗");
			System.out.println("...");
			System.out.println("...");
			System.out.println("...");
		}
	}

}
