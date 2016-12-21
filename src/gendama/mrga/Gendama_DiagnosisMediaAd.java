package gendama.mrga;

import static common.constant.HtmlConstants.*;
import static common.constant.PointConstants.*;

import org.openqa.selenium.By;

import common.enquete.Adsurvey_Enquete;
import common.enquete.Column_Enquete;
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
	/** 「ポイントIndex」 */
	int point_index = 1;

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
			String morimori_link = driver.findElement(By.className(C_ENQUETE_BOX)).findElements(By.tagName(T_A)).get(point_index)
					.getAttribute(A_HREF);
			// 「モリモリアンケート」タイトルを取得する
			String titel_text = driver.findElement(By.className(C_ENQUETE_BOX))
					.findElements(By.xpath("//dd[@class='title']")).get(i).findElement(By.tagName(T_STRONG)).getText();
			if (titel_text.matches(S_SINDAN)) {
				driver.get(morimori_link);
				shindan_start();
			}else if(titel_text.matches(S_ENQUETE)) {
				driver.get(morimori_link);
				enquete_start();
			}else{
				point_index++;
				continue;
			}
			driver.get(GENDAMA_AD_ENQ_LIST_URL);
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
			point_count += 10;
		} catch (Exception e) {
			System.out.println("【エラー】：モリモリ診断失敗");
		}
	}
	/**
	 * =================================================================================================================
	 * モリモリアンケートスタート
	 * =================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public void enquete_start() {
		try {
			String enquete_url = driver.getCurrentUrl();
			if(enquete_url.matches(GENDAMA_COLUMN_URL)){
				Column_Enquete.execute(driver);
				point_count += 10;
			}else if(enquete_url.matches(GENDAMA_MRGA_URL)){
				Adsurvey_Enquete.execute(driver);
				point_count += 10;
			}else{
				System.out.println("【警告】：モリモリアンケートスキップ。。。");
			}
		} catch (Exception e) {
			System.out.println("【エラー】：モリモリアンケート失敗");
		}
	}
}
