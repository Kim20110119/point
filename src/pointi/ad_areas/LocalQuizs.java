package pointi.ad_areas;

import static common.Common.*;
import static common.constant.HtmlConstants.*;
import static common.constant.PointConstants.*;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import pointi.Pointi;

/**
 * =====================================================================================================================
 * ポイントインカム：ザ・ご当地検定
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class LocalQuizs extends Pointi {

	/** 「daily-points」 */
	private static final String C_D_P = "daily-points";
	/** 「change-image」 */
	private static final String C_C_I = "change-image";
	/** 「answer-select」 */
	private static final String C_A_S = "answer-select";
	/** 「warning」 */
	private static final String I_W = "warning";
	/** 「answer-button」 */
	private static final String I_A_B = "answer-button";



	/** 「クマクマ総選挙URL」 */
	String election_url;
	/** 「獲得ポイント」 */
	int point_count = 0;
	/** 「再スタートフラグ」 */
	Boolean restart_flag = Boolean.FALSE;
	/** 「アンケート件数」 */
	int enquete_count = 0;

	/**
	 * コンストラクタ
	 */
	public LocalQuizs() {
		// 「CMくじ」
		driver.get(POINTI_CF_URL);
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
		try{
			// 「ザ・ご当地検定URL」取得する
			election_url = driver.findElement(By.className(C_D_P)).findElements(By.tagName(T_A)).get(2).getAttribute(A_HREF);
			if (StringUtils.isNoneEmpty(election_url)) {
				// 「ザ・ご当地検定」
				driver.get(election_url);
				// 「スタート」
				click(getByClass(C_C_I));
				// 「スタート」
				click(getByClass(C_C_I));
				// 当日の完了ステータスを判断
				if(getSize(getById(I_W)) > 0){
					// 「完了する」
					click(getByClass(C_C_I));
					// 「ザ・ご当地検定」終了する
					driver.quit();
					return point_count;
				}
				// 投票処理をする
				start();
				// 「次へ」
				click(getByClass(C_C_I));
				// 「次へ」
				click(getByClass(C_C_I));
				// 「次へ」
				click(getByClass(C_C_I));
				// 「完了する」
				click(getByClass(C_C_I));
				// 獲得ポイントカウント
				point_count += 10;
			}else{
				System.out.println("=====ザ・ご当地検定URL取得失敗");
			}
			driver.quit();
			return point_count;
		}catch(Exception e){
			driver.quit();
			System.out.println("===ザ・ご当地検定失敗");
			return point_count;
		}
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
			for(int i = 0; i < 12; i++){
				// 「答え選択肢カウント」
				int answer_count = getSize(getByClass(C_A_S));
				// 「答え選択肢」クリック
				clickByIndex(getByClass(C_A_S), int_random(answer_count));
				// 1秒待ち
				sleep(1000);
				// 「答える」ボタン
				click(getById(I_A_B));
				// 1秒待ち
				sleep(1000);
				// 「次の問題へ」
				click(getByClass(C_C_I));
				// 1秒待ち
				sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("=====検定スタート失敗");
			System.out.println("...");
			System.out.println("...");
			System.out.println("...");
		}
	}

}
