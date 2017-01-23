package voicenote.enquete;

import static common.Common.*;
import static common.constant.HtmlConstants.*;
import static common.constant.VoicenoteConstants.*;

import org.openqa.selenium.WebElement;

import voicenote.Pc_Voicenote;

/**
 * =====================================================================================================================
 * ボイスノート：アンケート
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Voicenote_Enquete extends Pc_Voicenote {
	/** 「ga-answerBtn」 */
	private static final String V_SUMMARY = "summary";
	/** 「アンケートURL」 */
	String enquete_url;
	/** 「獲得ポイント」 */
	int point_count = 0;
	/** 「再スタートフラグ」 */
	Boolean restart_flag = Boolean.FALSE;
	/** 「アンケート件数」 */
	int enquete_count = 0;

	/**
	 * コンストラクタ
	 */
	public Voicenote_Enquete() {
		// 「アンケート」
//		driver.get(PC_ENQUETE_URL);
	}

	/**
	 * =================================================================================================================
	 * アンケートメイン処理
	 * =================================================================================================================
	 *
	 * @return int point_couont 獲得済みポイント
	 *
	 * @author kimC
	 *
	 */
	public Integer execute() {
		try {
			for(int page_i = 1; page_i <= 10; page_i++){
				String enquete_page_url = PC_ENQUETE_PAGE_URL + page_i;
				driver.get(enquete_page_url);
				String originalHandel = driver.getWindowHandle();
				WebElement enquete = driver.findElement(getById("enquetes")).findElements(getByTag(T_UL)).get(0);
				enquete_count = enquete.findElements(getByTag(T_LI)).size();
				for(int enquete_i = 0; enquete_i < enquete_count; enquete_i++){
					enquete = driver.findElement(getById("enquetes")).findElements(getByTag(T_UL)).get(0);
					String enquete_url = enquete.findElements(getByTag(T_LI)).get(enquete_i).findElement(getByTag(T_A)).getAttribute(A_HREF);
					enquete(enquete_url, originalHandel,enquete_page_url);
				}
			}

			driver.quit();
			return point_count;

		}catch (Exception e){
			return 0;
		}

	}

	/**
	 * =================================================================================================================
	 * MINIアンケートスタート
	 * =================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public void enquete(String enquete_url, String originalHandel,String enquete_page_url) {
		try {
			driver.get(enquete_url);
			// アンケートカウントを取得する
			int choi_count = driver.findElement(getByXpath(T_TABLE,V_SUMMARY,"アンケート")).findElements(getByTag(T_TR)).size() / 2;
			for (int i = 0; i < choi_count; i++) {
				int choi_index = i * 2 + 1;
				WebElement e_element =	 driver.findElement(getByXpath(T_TABLE,V_SUMMARY,"アンケート")).findElements(getByTag(T_TR)).get(choi_index);
				int tyoe_count = e_element.findElement(getByTag(T_TD)).findElement(getByTag(T_P)).findElements(getByTag(T_INPUT)).size();
				e_element.findElement(getByTag(T_TD)).findElement(getByTag(T_P)).findElements(getByTag(T_INPUT)).get(int_random(tyoe_count)).click();
				e_element.findElement(getByTag(T_TD)).findElement(getByTag(T_P)).findElements(getByTag(T_INPUT)).get(int_random(tyoe_count)).click();
				e_element.findElement(getByTag(T_TD)).findElement(getByTag(T_P)).findElements(getByTag(T_INPUT)).get(int_random(tyoe_count)).click();
			}
			driver.findElement(getByXpath(T_INPUT, A_ALT, "確認ページへ")).click();
			sleep(1000);
			driver.findElement(getById("complete")).click();
			driver.findElement(getByXpath(T_INPUT, A_TYPE, "image")).click();
			tab_close(driver,originalHandel);
			driver.get(enquete_page_url);
		} catch (Exception e) {
			System.out.println("【エラー】：アンケート失敗");
		}
	}
}
