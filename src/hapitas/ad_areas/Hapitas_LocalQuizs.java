package hapitas.ad_areas;

import static common.constant.CommonConstants.*;
import static common.constant.HapitasConstants.*;
import static common.constant.HtmlConstants.*;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import common.quiz.Local_Quizs;
import hapitas.Pc_Hapitas;

/**
 * =====================================================================================================================
 * ハピタス：ザ・ご当地検定
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Hapitas_LocalQuizs extends Pc_Hapitas {

	/** 「daily-points」 */
	private static final String C_D_P = "daily-points";

	/** 「ザ・ご当地検定URL」 */
	String local_quizs_url;
	/** 「獲得ポイント」 */
	int point_count = 0;
	/** 「再スタートフラグ」 */
	Boolean restart_flag = Boolean.FALSE;
	/** 「アンケート件数」 */
	int enquete_count = 0;

	/**
	 * コンストラクタ
	 */
	public Hapitas_LocalQuizs() {
		// 「CMくじ」
		driver.get(PC_CM_URL);
	}

	/**
	 * =================================================================================================================
	 * ザ・ご当地検定
	 * =================================================================================================================
	 *
	 * @return int point_couont 獲得済みポイント
	 *
	 * @author kimC
	 *
	 */
	public Integer execute() {
		// 「ザ・ご当地検定URL」取得する
		local_quizs_url = driver.findElement(By.className(C_D_P)).findElements(By.tagName(T_A)).get(INT_2)
				.getAttribute(A_HREF);
		if (StringUtils.isNoneEmpty(local_quizs_url)) {
			// 「ザ・ご当地検定」
			driver.get(local_quizs_url);

			// 投票処理をする
			start();

			// 獲得ポイントカウント
			point_count += 10;
		} else {
			System.out.println("【エラー】：ザ・ご当地検定URL取得失敗");
		}
		driver.quit();
		return point_count;

	}

	/**
	 * =================================================================================================================
	 * 検定スタート
	 * =================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public void start() {
		try {
			Local_Quizs.execute(driver);
		} catch (Exception e) {
			System.out.println("【エラー】：ザ・ご当地検定失敗");
		}
	}

}
