package osaifu;

import static common.constant.OsaifuConstants.*;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.Sp_Point;

public class Sp_Osaifu extends Sp_Point  {

	public Sp_Osaifu() {
		// お財布：ログイン画面
		driver.get(PC_LOGIN_URL);
		// お財布：ログインメールアドレス
		sendkeysByStr(getByName("tel_or_email"), PC_LOGIN_MAIL);
		// お財布：ログインパスワード
		sendkeysByStr(getByName("passwd"), PC_LOGIN_PASSWORD);
		// お財布：ログインボタン
		driver.findElement(By.xpath("//input[@value='ログイン']")).click();
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
