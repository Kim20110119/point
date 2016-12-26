package gendama.sp;

import static common.constant.CommonConstants.*;
import static common.constant.GendamaConstants.*;
import static common.constant.HtmlConstants.*;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import common.enquete.Sp_Adsurvey_Enquete;
import gendama.Sp_Gendama;

/**
 * =====================================================================================================================
 * げん玉(携帯)：クマクマ調査団
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Sp_Gendama_Reados extends Sp_Gendama {

	/** 「daily-points」 */
	private static final String C_D_P = "daily-chance__list";
	/** 「survey_list」 */
	private static final String I_S_L = "survey_list";

	/** 「クマクマ調査団URL」 */
	String reados_url;
	/** 「獲得済みポイント」 */
	int point_count = 0;

	/**
	 * コンストラクタ
	 */
	public Sp_Gendama_Reados(){
		// 「CMくじ」
		driver.get(SP_CM_URL);
	}
	/**
	 * =================================================================================================================
	 * (携帯)クマクマ調査団メイン処理
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
		reados_url = driver.findElement(By.className(C_D_P)).findElements(By.tagName(T_A)).get(INT_2).getAttribute(A_HREF);
		if(StringUtils.isNotEmpty(reados_url)){
			// 「クマクマ調査団画面」
			driver.get(reados_url);
			// アンケート件数
			int enquete_count = driver.findElement(By.id(I_S_L)).findElements(By.tagName(T_A)).size();
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
			String enquete_url = driver.findElement(By.id(I_S_L)).findElements(By.tagName(T_A)).get(INT_0)
					.getAttribute(A_HREF);
			if(StringUtils.isNotEmpty(enquete_url)){
				// 「該当するAdsurveyアンケート」へ遷移する
				driver.get(enquete_url);
				// 「Adsurveyアンケート回答」
				if (Sp_Adsurvey_Enquete.execute(driver)) {
					point_count += 10;
				}
			}else{
				System.out.println("【エラー】：AdsurveyアンケートURL取得失敗!");
			}

		} catch (Exception e) {
			System.out.println("【エラー】：Adsurveyアンケート回答失敗!");
		}
	}
}
