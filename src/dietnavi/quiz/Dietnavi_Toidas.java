package dietnavi.quiz;

import static common.constant.DietnaviConstants.*;

import org.openqa.selenium.By;

import common.quiz.Toidas_Quiz;
import dietnavi.Pc_Dietnavi;

/**
 * =====================================================================================================================
 * GetMoney：トイダス
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Dietnavi_Toidas extends Pc_Dietnavi {

	/** 「entry-photo-wrap」 */
	private static final String C_E_P_W = "entry-photo-wrap";

	/** 「トイダスURL」 */
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
	public Dietnavi_Toidas() {
		// 「CMくじ」
		driver.get(PC_TOIDAS_URL);
	}

	/**
	 * =================================================================================================================
	 * トイダスメイン処理
	 * =================================================================================================================
	 *
	 * @return int point_couont 獲得済みポイント
	 *
	 * @author kimC
	 *
	 */
	public Integer execute() {
		// クイズカウントを取得する
		int quiz_count = getSize(getByClass(C_E_P_W));
		for (int i = 0; i < quiz_count; i++) {
			// 「トイダスURL」取得する
			driver.findElements(By.className(C_E_P_W)).get(i).click();
			// 投票処理をする
			start();
			// トイダス再スタート
			if (restart_flag) {
				driver.get(PC_TOIDAS_URL);
				driver.findElements(By.className(C_E_P_W)).get(i).click();
				restart();
			}
			// 「CMくじ」
			driver.get(PC_TOIDAS_URL);
		}

		driver.quit();
		return point_count;

	}

	/**
	 * =================================================================================================================
	 * トイダススタート
	 * =================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public void start() {
		try {
			Toidas_Quiz.execute(driver);
			restart_flag = Boolean.FALSE;
			point_count += 5;
		} catch (Exception e) {
			restart_flag = Boolean.TRUE;
			System.out.println("【エラー】：トイダススタート失敗");
		}
	}

	/**
	 * =================================================================================================================
	 * トイダス再スタート
	 * =================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public void restart() {
		try {
			Toidas_Quiz.execute(driver);
			restart_flag = Boolean.FALSE;
			point_count += 5;
		} catch (Exception e) {
			System.out.println("【エラー】：トイダス再スタート失敗");
		}
	}

}
