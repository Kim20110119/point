package cmsite.enquete;

import static common.constant.CmsiteConstants.*;
import static common.constant.CommonConstants.*;
import static common.constant.HtmlConstants.*;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import cmsite.Pc_Cmsite;
import common.enquete.Adsurvey_Enquete;

/**
 * =====================================================================================================================
 * CMサイト：ジョブアンケート
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Cmsite_Job_Enquete extends Pc_Cmsite {
	/** 「enquete_box」 */
	private static final String C_E_B = "enquete_box";
	/** 「ジョブアンケートURL」 */
	String reados_url;
	/** 「獲得済みポイント」 */
	int point_count = 0;

	/**
	 * コンストラクタ
	 */
	public Cmsite_Job_Enquete() {
		// 「CMくじ」
		driver.get(PC_JOB_ENQUETE_URL);
	}

	/**
	 * =================================================================================================================
	 * ジョブアンケートメイン処理
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
		// 「ジョブアンケートURL」
		// アンケート件数
		int enquete_count = driver.findElement(By.className(C_E_B)).findElements(By.tagName(T_A)).size();
		// 「獲得ポイント」
		for (int i = 0; i < enquete_count; i++) {
			// 調査スタート
			start();
			// 「ジョブアンケート画面」
			driver.get(PC_JOB_ENQUETE_URL);
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
			if (StringUtils.isNotEmpty(enquete_url)) {
				// 「該当するAdsurveyアンケート」へ遷移する
				driver.get(enquete_url);
				// 「Adsurveyアンケート回答」
				if (Adsurvey_Enquete.execute(driver)) {
					point_count += 10;
				}
			} else {
				System.out.println("【エラー】：AdsurveyアンケートURL取得失敗!");
			}

		} catch (Exception e) {
			System.out.println("【エラー】：Adsurveyアンケート回答失敗!");
			Adsurvey_Enquete.execute_restart(driver);
		}
	}
}
