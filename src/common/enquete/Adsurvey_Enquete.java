package common.enquete;

import static common.Common.*;
import static common.constant.HtmlConstants.*;
import static common.constant.PointConstants.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * =====================================================================================================================
 * 共通：Adsurveyアンケート
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Adsurvey_Enquete {

	/** 「btn」 */
	private static final String C_BTN = "btn";
	/** 「btn_regular」 */
	private static final String C_BTN_R = "btn_regular";

	/**
	 * =================================================================================================================
	 * Adsurveyアンケート
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
		// 0.5秒待ち
		Thread.sleep(500);
		// 「フレームURL」
		String frame_url = driver.findElements(By.tagName(T_IFRAME)).get(INT_0).getAttribute(A_SRC);
		// 「フレーム」
		driver.get(frame_url);
		// 「次へ」ボタン
		driver.findElement(By.className("btn_regular")).click();
		// 0.5秒待ち
		Thread.sleep(500);
		// 「性別」（男）
		driver.findElement(By.id(CHO_1)).click();
		// 「次へ」ボタン
		driver.findElement(By.className(C_BTN)).click();
		// 0.5秒待ち
		Thread.sleep(500);
		// 「年齢」（30代）
		driver.findElement(By.id(CHO_5)).click();
		// 「次へ」ボタン
		driver.findElement(By.className(C_BTN)).click();
		// 0.5秒待ち
		Thread.sleep(500);
		// 「職業」（会社員）
		driver.findElement(By.id(CHO_11)).click();
		// 「次へ」ボタン
		driver.findElement(By.className(C_BTN)).click();
		// 0.5秒待ち
		Thread.sleep(500);
		// 「住まい」（大阪）
		Select select = new Select(driver.findElement(By.name(QUE_4)));
		select.selectByIndex(27);
		// 「次へ」ボタン
		driver.findElement(By.className(C_BTN)).click();
		// 0.5秒待ち
		Thread.sleep(500);
		// 「アンケート質問」
		for (int line = 1; line < 9; line++) {
			// 「ラジオボタン」
			int radio_count = driver.findElements(By.xpath("//input[@type='radio']")).size();
			// 「チェックボックス」
			int checkbox_count = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
			if (radio_count > 0) {
				driver.findElements(By.xpath("//input[@type='radio']")).get(int_random(radio_count)).click();
				// 「次へ」ボタン
				driver.findElement(By.className(C_BTN)).click();
				// 0.5秒待ち
				Thread.sleep(1000);
				continue;
			} else if (checkbox_count > 0) {
				driver.findElements(By.xpath("//input[@type='checkbox']")).get(int_random(checkbox_count)).click();
				driver.findElements(By.xpath("//input[@type='checkbox']")).get(int_random(checkbox_count)).click();
				driver.findElements(By.xpath("//input[@type='checkbox']")).get(int_random(checkbox_count)).click();
				// 「次へ」ボタン
				driver.findElement(By.className(C_BTN)).click();
				// 0.5秒待ち
				Thread.sleep(1000);
				continue;
			} else {
				int select_count = driver.findElement(By.className("answer")).findElements(By.tagName("select")).size();
				if(select_count > 0){
					// 「セレクト」
					Select anser_select = new Select(driver.findElement(By.className("answer")).findElements(By.tagName("select")).get(0));
					anser_select.selectByIndex(2);
					// 「次へ」ボタン
					driver.findElement(By.className(C_BTN)).click();
					// 0.5秒待ち
					Thread.sleep(1000);
				}else{
					// 「次へ」ボタン
					driver.findElement(By.className(C_BTN_R)).click();
				}
				break;
			}

		}

		return Boolean.TRUE;
	}

	/**
	 * =================================================================================================================
	 * Adsurveyアンケート再スタート
	 * =================================================================================================================
	 *
	 * @param WebDriver
	 *            driver
	 * @return execute_flag
	 *
	 * @author kimC
	 *
	 */
	public static Boolean execute_restart(WebDriver driver){
		try {
			// 「次へ」ボタン
			driver.findElement(By.className("btn_regular")).click();
			// 0.5秒待ち
			Thread.sleep(500);
			// 「アンケート質問」
			for (int line = 1; line < 9; line++) {
				// 「ラジオボタン」
				int radio_count = driver.findElements(By.xpath("//input[@type='radio']")).size();
				// 「チェックボックス」
				int checkbox_count = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
				if (radio_count > 0) {
					driver.findElements(By.xpath("//input[@type='radio']")).get(int_random(radio_count)).click();
					// 「次へ」ボタン
					driver.findElement(By.className(C_BTN)).click();
					// 0.5秒待ち
					Thread.sleep(1000);
					continue;
				} else if (checkbox_count > 0) {
					driver.findElements(By.xpath("//input[@type='checkbox']")).get(int_random(checkbox_count)).click();
					driver.findElements(By.xpath("//input[@type='checkbox']")).get(int_random(checkbox_count)).click();
					driver.findElements(By.xpath("//input[@type='checkbox']")).get(int_random(checkbox_count)).click();
					// 「次へ」ボタン
					driver.findElement(By.className(C_BTN)).click();
					// 0.5秒待ち
					Thread.sleep(1000);
					continue;
				} else {
					int select_count = driver.findElement(By.className("answer")).findElements(By.tagName("select")).size();
					if(select_count > 0){
						// 「セレクト」
						Select anser_select = new Select(driver.findElement(By.className("answer")).findElements(By.tagName("select")).get(0));
						anser_select.selectByIndex(2);
						// 「次へ」ボタン
						driver.findElement(By.className(C_BTN)).click();
						// 0.5秒待ち
						Thread.sleep(1000);
					}else{
						// 「次へ」ボタン
						driver.findElement(By.className(C_BTN_R)).click();
					}
					break;
				}

			}

			return Boolean.TRUE;
		} catch (Exception e) {
			return Boolean.FALSE;
		}

	}

}
