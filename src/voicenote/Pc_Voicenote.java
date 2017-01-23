package voicenote;

import static common.constant.VoicenoteConstants.*;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;

import common.Point;

public class Pc_Voicenote extends Point  {

	public Pc_Voicenote() {
		// モッピー：ログイン画面
		driver.get(PC_LOGIN_URL);
		// モッピー：ログインメールアドレス
		sendkeysByStr(getByName(HTML_LOGIN_NAME), PC_LOGIN_MAIL);
		// モッピー：ログインパスワード
		sendkeysByStr(getByName(HTML_LOGIN_PASS), PC_LOGIN_PASSWORD);
		// モッピー：ログインボタン
		click(getByName(HTML_LOGIN_SUBMIT));
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
	public static void tab_close(WebDriver driver, String originalHandle) {
		try {
			for (String handle : driver.getWindowHandles()) {
				if (!handle.equals(originalHandle)) {
					driver.switchTo().window(handle);
					driver.close();
				}
			}
			driver.switchTo().window(originalHandle);
		} catch (Exception e) {
		}

	}

}
