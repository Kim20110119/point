package osaifu;

import static common.constant.OsaifuConstants.*;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;

import common.Point;

public class Pc_Osaifu extends Point  {

	public Pc_Osaifu() {
		// お財布：ログイン画面
		driver.get(PC_LOGIN_URL);
		// お財布：ログインメールアドレス
		sendkeysByStr(getByName("tel_or_email"), PC_LOGIN_MAIL);
		// お財布：ログインパスワード
		sendkeysByStr(getByName("passwd"), PC_LOGIN_PASSWORD);
		// お財布：ログインボタン
		click(getByName("submit"));
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
