package chance.enquete;

import static common.constant.ChanceConstants.*;
import static common.constant.HtmlConstants.*;

import org.openqa.selenium.By;

import chance.Pc_Chance;
import common.enquete.Hikikagami_Enquete;

/**
 * =====================================================================================================================
 * チャンスイット：アンケート
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Chance_Enquete extends Pc_Chance {

	/** 「ci-reserch-table」 */
	private static final String I_C_R_T = "ci-reserch-table";


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
	public Chance_Enquete() {
		// 「アンケート」
		driver.get(PC_ENQUETE_URL);
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
		// クイズカウントを取得する
		int enquete_count = driver.findElement(By.id(I_C_R_T)).findElements(By.tagName(T_A)).size();
		for (int i = 0; i < enquete_count; i++) {
			// 「アンケートURL」取得する
			enquete_url = driver.findElement(By.id(I_C_R_T)).findElements(By.tagName(T_A)).get(0)
					.getAttribute(A_HREF);
			driver.get(enquete_url);
			start();
			// 「アンケート」
			driver.get(PC_ENQUETE_URL);
		}

		driver.quit();
		return point_count;

	}

	/**
	 * =================================================================================================================
	 * MINIアンケートスタート
	 * =================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public void start() {
		try {
			Hikikagami_Enquete.execute(driver);
			point_count += 5;
		} catch (Exception e) {
			System.out.println("【エラー】：アンケートスタート失敗");
		}
	}
}
