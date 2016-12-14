package gendama.mrga;

import static common.Common.*;
import static common.constant.HtmlConstants.*;
import static common.constant.PointConstants.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import gendama.Pc_Gendama;

/**
 * =====================================================================================================================
 * げん玉：モリモリクイズ
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Gendama_Quiz extends Pc_Gendama {

	/** 「獲得ポイント」 */
	int point_count = 0;

	/**
	 * コンストラクタ
	 */
	public Gendama_Quiz() {
		// げん玉：モリモリクイズ
		driver.get(GENDAMA_MRGA_QUIZ_URL);
	}

	/**
	 * =================================================================================================================
	 * モリモリクイズ
	 * =================================================================================================================
	 *
	 * @return int point_couont 獲得済みポイント
	 *
	 * @author kimC
	 *
	 */
	public Integer execute() {
		// げん玉：モリモリクイズURL
		String quiz_url = driver.findElement(By.className("quiz_frame")).getAttribute(A_SRC);
		// 「げん玉」モリモリクイズ画面
		driver.get(quiz_url);
		start();
		return point_count;

	}

	/**
	 * =================================================================================================================
	 * モリモリクイズ
	 * =================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public void start() {
		try {
			for(int i = 0;i < 20; i++){
				ad_close(driver);
				// １秒待ち
				Thread.sleep(500);
				// 「クイズカウント」
				int quiz_count = getQuizCount();
				if(quiz_count == 0){
					System.out.println("本日のモリモリクイズ完了しました！");
					break;
				}
				driver.findElement(By.className("QPsection")).findElement(By.tagName(T_UL)).findElements(By.tagName(T_A)).get(int_random(quiz_count)).click();
			}
			// ドライバー終了
			driver.quit();
		} catch (Exception e) {
			System.out.println("【エラー】：モリモリクイズ失敗");
			point_count -= 10;
			// ドライバー終了
			driver.quit();
		}
	}

	/**
	 * =================================================================================================================
	 * クイズカウントを取得する
	 * =================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public int getQuizCount() {
		int quiz_count = 0;
		try {
			quiz_count = driver.findElement(By.className("QPsection")).findElement(By.tagName(T_UL)).findElements(By.tagName(T_A)).size();
			return quiz_count;
		} catch (Exception e) {
			return quiz_count;
		}
	}

	/**
	 * =================================================================================================================
	 * 広告を閉じる
	 * =================================================================================================================
	 *
	 * @param WebDriver
	 *            driver
	 *
	 * @author kimC
	 *
	 */
	public static void ad_close(WebDriver driver) {
		try {
			driver.findElement(By.className("win_show_adds_close")).click();
			// 0.8秒待ち
			Thread.sleep(800);
		} catch (Exception e) {
		}
	}

}
