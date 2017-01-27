package point_land;

import static common.constant.PointConstants.*;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.Point;

/**
 * ポイントランド：共通処理
 *
 * @author kimC
 *
 */
public class Pc_Point_Land extends Point {

	public Pc_Point_Land() {
		// ポイントランド：ログイン画面
		driver.get(POINT_LAND_LOGIN_URL);
		// ポイントランド：ログインメールアドレス
		driver.findElement(By.name("mailadr")).sendKeys(POINT_LAND_LOGIN_MAIL);
		// ポイントランド：ログインパスワード
		driver.findElement(By.name("passwd")).sendKeys(POINT_LAND_LOGIN_PASSWORD);
		// ポイントランド：ログインボタン
		driver.findElement(By.id("button")).click();
		// 3秒待ち
		sleep(3000);
	}

	/**
	 * =================================================================================================================
	 * タブを取得する
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
