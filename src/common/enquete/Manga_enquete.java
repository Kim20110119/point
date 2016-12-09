package common.enquete;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * =====================================================================================================================
 * 共通：漫画アンケート
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Manga_enquete {
	/** 「btn」 */
	private static final String C_BTN = "btn";
	/** 「btn_regular」 */
	private static final String C_BTN_R = "btn_regular";

	/**
	 * =================================================================================================================
	 * 漫画アンケート
	 * =================================================================================================================
	 *
	 * @param WebDriver driver
	 * @param String url
	 *
	 * @author kimC
	 *
	 */
	public static Boolean execute(WebDriver driver,String url) throws Exception{
		// アンケート画面へ遷移する
		driver.get(url);
		// 0.5秒待ち
		Thread.sleep(500);
		// 「進む」
		driver.findElement(By.xpath("//input[@alt='進む']")).click();


		return Boolean.TRUE;
	}
}
