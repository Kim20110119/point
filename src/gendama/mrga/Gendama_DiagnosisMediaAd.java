package gendama.mrga;

import static common.constant.HtmlConstants.*;
import static common.constant.PointConstants.*;

import org.openqa.selenium.By;

import common.shindan.Diagnosis;
import gendama.Pc_Gendama;

/**
 * =====================================================================================================================
 * げん玉：モリモリアンケート
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Gendama_DiagnosisMediaAd extends Pc_Gendama {

	/** 「enqueteBox」 */
	public static final String C_ENQUETE_BOX = "enqueteBox";
	/** 「獲得ポイント」 */
	int point_count = 0;

	/**
	 * コンストラクタ
	 */
	public Gendama_DiagnosisMediaAd() {
		// げん玉：モリゲー
		driver.get(GENDAMA_AD_ENQ_LIST_URL);
	}

	/**
	 * =================================================================================================================
	 * モリモリアンケート
	 * =================================================================================================================
	 *
	 * @return int point_couont 獲得済みポイント
	 *
	 * @author kimC
	 *
	 */
	public Integer execute() {
		// げん玉：モリモリアンケート件数
		int enquete_count = driver.findElement(By.className(C_ENQUETE_BOX)).findElements(By.tagName(T_A)).size();
		for (int i = 1; i < enquete_count; i++) {
			// 「モリモリアンケートURL」
			String morimori_link = driver.findElement(By.className(C_ENQUETE_BOX)).findElements(By.tagName(T_A)).get(i)
					.getAttribute(A_HREF);
			// 「モリモリアンケート」タイトルを取得する
			String titel_text = driver.findElement(By.className(C_ENQUETE_BOX))
					.findElements(By.xpath("//dd[@class='title']")).get(i).findElement(By.tagName(T_STRONG)).getText();
			if (titel_text.matches(S_SINDAN)) {
				driver.get(morimori_link);
				shindan_start();
			}else {
				break;
			}
			driver.get(GENDAMA_AD_ENQ_LIST_URL);
			point_count += 10;
		}
		return point_count;

	}

	/**
	 * =================================================================================================================
	 * モリモリ診断スタート
	 * =================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public void shindan_start() {
		try {
			Diagnosis.execute(driver);
		} catch (Exception e) {
			System.out.println("【エラー】：モリモリ診断失敗");
			point_count -= 10;
		}
	}
}
