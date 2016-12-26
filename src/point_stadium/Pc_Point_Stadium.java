package point_stadium;

import static common.constant.pointStadiumConstants.*;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.Point;

/**
 * ポイントスタジアム：共通処理
 *
 * @author kimC
 *
 */
public class Pc_Point_Stadium extends Point {

	public Pc_Point_Stadium() {
		// ポイントスタジアム：ログイン画面
		driver.get(PC_LOGIN_URL);
		// ポイントスタジアム：ログインメールアドレス
		driver.findElement(By.id("mailadr")).sendKeys(PC_LOGIN_MAIL);
		// ポイントスタジアム：ログインパスワード
		driver.findElement(By.id("passwd")).sendKeys(PC_LOGIN_PASSWORD);
		// ポイントスタジアム：ログインボタン
		driver.findElement(By.xpath("//img[@src='img/btn_login.gif']")).click();
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
