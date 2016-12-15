package gendama.sp;

import static common.Common.*;
import static common.constant.HtmlConstants.*;
import static common.constant.PointConstants.*;

import org.openqa.selenium.By;

import common.shindan.Sp_WebShindan;
import gendama.Sp_Gendama;

/**
 * =====================================================================================================================
 * げん玉：WEB診断
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Sp_Gendama_Shindan extends Sp_Gendama {
	/** 「クマクマ総選挙URL」 */
	String election_url;
	/** 「獲得ポイント」 */
	int point_count = 0;
	/** 「再スタートフラグ」 */
	Boolean restart_flag = Boolean.FALSE;
	/** 「WEB診断開始番号」 */
	int start = 311055;
	/** 「WEB診断終了番号」 */
	int end = 311162;

	/**
	 * コンストラクタ
	 */
	public Sp_Gendama_Shindan() {
		// 「WEB診断」
		driver.get(SP_GENDAMA_WEB_SHINDAN_URL);
	}

	/**
	 * =================================================================================================================
	 * げん玉：WEB診断
	 * =================================================================================================================
	 *
	 * @return int point_couont 獲得済みポイント
	 *
	 * @author kimC
	 *
	 */
	public Integer execute() {

		for (int i = start; i < end; i++) {

			// 0.5秒待ち
			sleep(500);
			// 診断URL
//			election_url = driver.findElements(By.id("nosnap")).get(1).findElements(By.tagName(T_A)).get(0).getAttribute(A_HREF);
			election_url = "http://www.gendama.jp/sp/client_detail?cd_client="+i+"&rt=s";
			// WEB診断
			driver.get(election_url);
			String str_shindan = driver.findElement(By.className("service_condition")).getText();
			if(str_matche(str_shindan, "診断完了")){
				String sindan_url = driver.findElement(By.className("btn_pt_get_2")).findElement(By.tagName(T_A))
						.getAttribute(A_HREF);
				// WEB診断
				driver.get(sindan_url);
				if (start()) {
					point_count += 10;
				} else {
					// WEB診断
					driver.get(election_url);
					restart();
				}
			}

			// 「WEB診断」
			driver.get(SP_GENDAMA_WEB_SHINDAN_URL);
		}
		driver.quit();
		return point_count;
	}

	public Boolean start() {
		try {
			Sp_WebShindan.execute(driver);
			return Boolean.TRUE;
		} catch (Exception e) {
			System.out.println("===WEB診断失敗");
			return Boolean.FALSE;
		}

	}

	public void restart() {
		try {
			Sp_WebShindan.execute(driver);
			point_count += 10;
		} catch (Exception e) {
			System.out.println("===WEB診断再スタート失敗");
		}

	}

}
