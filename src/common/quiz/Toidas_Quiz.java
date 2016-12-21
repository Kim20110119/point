package common.quiz;

import static common.Common.*;
import static common.constant.HtmlConstants.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * =====================================================================================================================
 * 共通：トイダス
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Toidas_Quiz {

	/** 「toidas-question-answer-item」 */
	private static final String C_T_Q_A_I = "toidas-question-answer-item";

	/**
	 * =================================================================================================================
	 * トイダス
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
		// IframeURLを取得する
		String iframe_url = driver.findElement(By.id("toidas-frame")).getAttribute(A_SRC);
		// 1秒待ち
		Thread.sleep(1000);
		// Iframe画面へ遷移する
		driver.get(iframe_url);
		// 1秒待ち
		Thread.sleep(1000);
		// 「始める」
		driver.findElement(By.id("pager")).click();
		// 「回答」
		for (int i = 1; i <= 10; i++) {
			// 1秒待ち
			Thread.sleep(1000);
			String str_item_id = "js-toidas-q" + i;
			int answer_count = driver.findElement(By.id(str_item_id)).findElements(By.className(C_T_Q_A_I)).size();
			driver.findElement(By.id(str_item_id)).findElements(By.className(C_T_Q_A_I)).get(int_random(answer_count))
					.click();
			// 「次へ」
			driver.findElement(By.id("pager")).click();
			// 1秒待ち
			Thread.sleep(1000);
			// 「次へ」
			driver.findElement(By.id("pager")).click();
		}
		// 「ポイントを獲得する」
		driver.findElement(By.id("pager")).click();
		// 2秒待ち
		Thread.sleep(2000);
		return Boolean.TRUE;

	}

}
