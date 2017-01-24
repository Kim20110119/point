package happymile.ad_areas;

import static common.constant.CommonConstants.*;
import static common.constant.HappymileConstants.*;
import static common.constant.HtmlConstants.*;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import common.enquete.Adsurvey_Enquete;
import happymile.Pc_Happymile;

/**
 * =====================================================================================================================
 * ハッピーマイル：アンケート
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Happymile_Enquete extends Pc_Happymile {

	/** 「daily-points」 */
	private static final String C_D_P = "daily-points";
	/** 「enquete_box」 */
	private static final String C_E_B = "enquete_box";
	/** 「クマクマ調査団URL」 */
	String reados_url;
	/** 「獲得済みポイント」 */
	int point_count = 0;

	/**
	 * コンストラクタ
	 */
	public Happymile_Enquete(){
		// 「アンケート」
		driver.get(PC_ENQUETE_URL);
	}
	/**
	 * =================================================================================================================
	 * アンケートメイン処理
	 * =================================================================================================================
	 *
	 * @param WebDriver
	 *            driver
	 * @param String
	 *            url
	 *
	 * @author kimC
	 *
	 */
	public Integer execute() {
		// 「クマクマ調査団URL」
		reados_url = driver.findElements(By.linkText("◆毎日２０マイル！　ハッピーマイル・アンケート　◆")).get(0).getAttribute("href");
		if(StringUtils.isNotEmpty(reados_url)){
			// 「クマクマ調査団画面」
			driver.get(reados_url);
			// アンケート件数
			int enquete_count = driver.findElement(By.className(C_E_B)).findElements(By.tagName(T_A)).size();
			// 「獲得ポイント」
			for (int i = 0; i < enquete_count; i++) {
				// 調査スタート
				start();
				// 「クマクマ調査団画面」
				driver.get(reados_url);
			}
		}else{
			System.out.println("【エラー】：クマクマ調査団URL取得失敗!");
		}
		driver.quit();
		return point_count;
	}

	/**
	 * =================================================================================================================
	 * クマクマ調査スタート
	 * =================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public void start() {
		try {
			// 「AdsurveyアンケートURL」
			String enquete_url = driver.findElement(By.className(C_E_B)).findElements(By.tagName(T_A)).get(INT_0)
					.getAttribute(A_HREF);
			if(StringUtils.isNotEmpty(enquete_url)){
				// 「該当するAdsurveyアンケート」へ遷移する
				driver.get(enquete_url);
				// 「Adsurveyアンケート回答」
				if (Adsurvey_Enquete.execute(driver)) {
					point_count += 10;
				}
			}else{
				System.out.println("【エラー】：AdsurveyアンケートURL取得失敗!");
			}

		} catch (Exception e) {
			System.out.println("【エラー】：Adsurveyアンケート回答失敗!");
			Adsurvey_Enquete.execute_restart(driver);
		}
	}
}
