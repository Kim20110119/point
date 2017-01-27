package chobirich;

import static common.constant.ChobirichConstants.*;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.Sp_Point;

public class Sp_Chobirich extends Sp_Point  {

	public Sp_Chobirich() {
		// ちょびリッチ：ログイン画面
		driver.get(PC_LOGIN_URL);
		// ちょびリッチ：ログインメールアドレス
		driver.findElement(By.id("form_uid")).sendKeys(PC_LOGIN_MAIL);
		// ちょびリッチ：ログインパスワード
		driver.findElement(By.id("form_pswd")).sendKeys(PC_LOGIN_PASSWORD);
		// 5秒待ち
		sleep(5000);
		// ちょびリッチ：ログインボタン
		driver.findElement(By.id("form_submit")).click();
	}

	/**
	 * =================================================================================================================
	 * タブを閉じる
	 * =================================================================================================================
	 *
	 * @param WebDriver
	 *            driver
	 * @param String
	 *            originalHandle
	 * @param By
	 *            by
	 *
	 * @author kimC
	 *
	 */
	public static String getUrlByTab(WebDriver driver, String originalHandle) {
		String tab_url = StringUtils.EMPTY;
		try {
			for (String handle : driver.getWindowHandles()) {
				if (!handle.equals(originalHandle)) {
					driver.switchTo().window(handle);
					tab_url = driver.getCurrentUrl();
					return tab_url;
				}
			}
			return tab_url;
		} catch (Exception e) {
			return tab_url;
		}

	}

}
