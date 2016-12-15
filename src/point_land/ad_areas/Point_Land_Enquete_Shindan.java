package point_land.ad_areas;

import static common.constant.HtmlConstants.*;
import static common.constant.PointConstants.*;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import common.enquete.Adsurvey_Enquete;
import point_land.Pc_Point_Land;

/**
 * =====================================================================================================================
 * ポイントランド：アンケート&診断
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Point_Land_Enquete_Shindan extends Pc_Point_Land {
	/** 「enquete_box」 */
	private static final String C_E_B = "enquete_box";
	/** 「アンケート&診断URL」 */
	String enquete_url;
	/** 「獲得済みポイント」 */
	int point_count = 0;

	/**
	 * コンストラクタ
	 */
	public Point_Land_Enquete_Shindan() {
		// 「CMくじ」
		driver.get(POINT_LAND_ENQUETE_SHINDAN_URL);
		driver.findElement(By.name("frmMEnq")).submit();
		String originalHandel = driver.getWindowHandle();
		enquete_url = super.getUrlByTab(driver, originalHandel);
		driver.get(enquete_url);
	}

	/**
	 * =================================================================================================================
	 * アンケート&診断メイン処理
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
		// アンケート件数
		int enquete_count = driver.findElement(By.className(C_E_B)).findElements(By.tagName(T_A)).size();
		// 「獲得ポイント」
		for (int i = 0; i < enquete_count; i++) {
			// 調査スタート
			start();
			// 「クマクマ調査団画面」
			driver.get(enquete_url);
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
