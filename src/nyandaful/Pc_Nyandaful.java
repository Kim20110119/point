package nyandaful;

import static common.constant.NyandafulConstants.*;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.Point;

/**
 * にゃんダフル：共通処理
 *
 * @author kimC
 *
 */
public class Pc_Nyandaful extends Point {

	public Pc_Nyandaful() {
		// にゃんダフル：ログイン画面
		driver.get(PC_LOGIN_URL);
		// にゃんダフル：ログインメールアドレス
		driver.findElement(By.id("mailadr")).sendKeys(PC_LOGIN_MAIL);
		// にゃんダフル：ログインパスワード
		driver.findElement(By.id("password")).sendKeys(PC_LOGIN_PASSWORD);
		// にゃんダフル：ログインボタン
		driver.findElement(By.xpath("//button[@type='submit']")).click();
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
