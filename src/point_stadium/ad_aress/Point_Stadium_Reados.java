package point_stadium.ad_aress;

import static common.constant.HtmlConstants.*;
import static common.constant.pointStadiumConstants.*;
import static common.constant.CommonConstants.*;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import common.enquete.Adsurvey_Enquete;
import point_stadium.Pc_Point_Stadium;

/**
 * =====================================================================================================================
 * げん玉：クマクマ調査団
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Point_Stadium_Reados extends Pc_Point_Stadium {

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
	public Point_Stadium_Reados() {
		// 「CMくじ」
		driver.get(PC_CM_URL);
		driver.findElement(By.xpath("//input[@value='ＣＭでポイントに参加']")).click();
		String originalHandel = driver.getWindowHandle();
		String cm_url = super.getUrlByTab(driver, originalHandel);
		driver.get(cm_url);
	}

	/**
	 * =================================================================================================================
	 * クマクマ調査団メイン処理
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
		reados_url = driver.findElement(By.className(C_D_P)).findElements(By.tagName(T_A)).get(INT_4)
				.getAttribute(A_HREF);
		if (StringUtils.isNotEmpty(reados_url)) {
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
		} else {
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
		// 「AdsurveyアンケートURL」
		String enquete_url = driver.findElement(By.className(C_E_B)).findElements(By.tagName(T_A)).get(INT_0)
				.getAttribute(A_HREF);
		try {
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
			// 「該当するAdsurveyアンケート」へ遷移する
			driver.get(enquete_url);
			System.out.println("【エラー】：Adsurveyアンケート回答失敗!");
			Adsurvey_Enquete.execute_restart(driver);
		}
	}
}
