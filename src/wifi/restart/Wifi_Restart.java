package wifi.restart;

import static common.constant.HtmlConstants.*;
import static common.constant.PointConstants.*;

import org.openqa.selenium.By;

import common.enquete.Adsurvey_Enquete;
import wifi.Wifi;

/**
 * =====================================================================================================================
 * ポイントインカム：Webインタビュー
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Wifi_Restart extends Wifi {
	/**
	 * コンストラクタ
	 */
	public Wifi_Restart(){
	}
	/**
	 * =================================================================================================================
	 * WEBインタビュー
	 * =================================================================================================================
	 *
	 * @param WebDriver
	 *            driver
	 * @param String
	 *            url
	 *
	 * @author kimCi
	 *
	 */
	public Integer execute() {
		driver.findElement(By.id("UPDATE_BUTTON")).click();
		driver.switchTo().alert().accept();
		sleep(90000);
		driver.quit();
		return 0;		
	}
}
