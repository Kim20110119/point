package pointi.ad_areas;

import static common.constant.HtmlConstants.*;
import static common.constant.PointConstants.*;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import common.enquete.Adsurvey_Enquete;
import pointi.Pc_Pointi;

/**
 * =====================================================================================================================
 * ポイントインカム：クマクマ調査団
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pointi_Reados extends Pc_Pointi {

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
	public Pointi_Reados() {
		// 「CMくじ」
		driver.get(POINTI_CF_URL);
	}

	/**
	 * =================================================================================================================
	 * クマクマ調査団
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
		reados_url = driver.findElement(By.className(C_D_P)).findElements(By.tagName(T_A)).get(3).getAttribute(A_HREF);
		if(StringUtils.isNotEmpty(reados_url)){
			// 「クマクマ調査団画面」
			driver.get(reados_url);
			// アンケート件数
			int enquete_count = driver.findElement(By.className(C_E_B)).findElements(By.tagName(T_A)).size();
			// 「獲得ポイント」
			for (int i = 0; i < enquete_count; i++) {
				// 調査スタート
				start();
				driver.get(reados_url);
			}
		}else{
			System.out.println("【エラー】：クマクマ調査団URL取得失敗");
		}
		driver.quit();
		return point_count;
	}

	/**
	 * =================================================================================================================
	 * 調査スタート
	 * =================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public void start() {
		try {
			// 「アンケートURL」
			String enquete_url = driver.findElement(By.className(C_E_B)).findElements(By.tagName(T_A)).get(0)
					.getAttribute(A_HREF);
			// 「該当するAdsurveyアンケート」へ遷移する
			driver.get(enquete_url);
			// 「アンケート回答」
			if (Adsurvey_Enquete.execute(driver)) {
				point_count += 10;
			}
		} catch (Exception e) {
			System.out.println("【エラー】：調査タート失敗");
			System.out.println("【エラー】：クマクマ調査団遷移再スタート");
		}
	}

}
