package common.quiz;

import static common.Common.*;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * =====================================================================================================================
 * 共通：当地検定
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Local_Quizs {

	/** 「change-image」 */
	private static final String C_C_I = "change-image";
	/** 「answer-select」 */
	private static final String C_A_S = "answer-select";
	/** 「warning」 */
	private static final String I_W = "warning";
	/** 「answer-button」 */
	private static final String I_A_B = "answer-button";
	/** 「start button」 */
	private static final String N_S_B = "start button";

	/**
	 * =================================================================================================================
	 * 当地検定
	 * =================================================================================================================
	 *
	 * @param WebDriver
	 *            driver
	 * @return execute_flag
	 *
	 * @author kimC
	 *
	 */
	public static Boolean execute(WebDriver driver) throws Exception {
		// 広告
		String str_ad = StringUtils.EMPTY;
		// 広告を閉じる
		str_ad = driver.findElement(By.id("popup-ad")).getAttribute("style");
		if (StringUtils.isNotEmpty(str_ad)) {
			driver.findElement(By.className("popup-close")).click();
		}
		// 「スタート」
		driver.findElement(By.className(C_C_I)).click();
		// 2秒待ち
		Thread.sleep(2000);
		// 広告を閉じる
		str_ad = driver.findElement(By.id("popup-ad")).getAttribute("style");
		if (StringUtils.isNotEmpty(str_ad)) {
			driver.findElement(By.className("popup-close")).click();
		}
		// 「スタート」
		driver.findElement(By.name(N_S_B)).click();
		// 当日の完了ステータスを判断
		int end_count = driver.findElements(By.id(I_W)).size();
		if (end_count > 0) {
			// 広告を閉じる
			str_ad = driver.findElement(By.id("popup-ad")).getAttribute("style");
			if (StringUtils.isNotEmpty(str_ad)) {
				driver.findElement(By.className("popup-close")).click();
			}
			// 「完了する」
			driver.findElement(By.className(C_C_I)).click();
			return Boolean.TRUE;
		}
		// 投票処理をする
		for (int i = 0; i < 12; i++) {
			// 「答え選択肢カウント」
			int answer_count = driver.findElements(By.className(C_A_S)).size();
			// 「答え選択肢」クリック
			driver.findElements(By.className(C_A_S)).get(int_random(answer_count)).click();
			// 2秒待ち
			Thread.sleep(2000);
			// 「答える」ボタン
			driver.findElement(By.id(I_A_B)).click();
			// 1秒待ち
			Thread.sleep(1000);
			// 「次の問題へ」
			driver.findElement(By.className(C_C_I)).click();
			// 1秒待ち
			Thread.sleep(1000);
		}
		// 広告を閉じる
		str_ad = driver.findElement(By.id("popup-ad")).getAttribute("style");
		if (StringUtils.isNotEmpty(str_ad)) {
			driver.findElement(By.className("popup-close")).click();
		}
		// 「次へ」
		driver.findElement(By.className(C_C_I)).click();
		// 1秒待ち
		Thread.sleep(1000);
		// 広告を閉じる
		str_ad = driver.findElement(By.id("popup-ad")).getAttribute("style");
		if (StringUtils.isNotEmpty(str_ad)) {
			driver.findElement(By.className("popup-close")).click();
		}
		// 「完了する」
		driver.findElement(By.className(C_C_I)).click();
		// 1秒待ち
		Thread.sleep(1000);
		return Boolean.TRUE;

	}

}
