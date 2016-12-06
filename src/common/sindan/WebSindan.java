package common.sindan;

import static common.Common.*;
import static common.constant.HtmlConstants.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * =====================================================================================================================
 * 共通：WEB診断
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class WebSindan {

	private static final String C_SUBMINT = "submit-btn";
	private static final String C_END = "end-btn";
	private static final String C_BTN = "btn-primary";

	/**
	 * =================================================================================================================
	 * WEB診断処理
	 * =================================================================================================================
	 *
	 * @param WebDriver driver
	 * @param String url
	 *
	 * @author kimC
	 *
	 */
	public static Boolean execute(WebDriver driver,String url,int int_start,int int_end) throws Exception{
		for(int i = int_start; i < int_end; i++){
			// WEB診断一覧
			driver.get(url);
			// 0.5秒待ち
			Thread.sleep(500);
			// 診断URL
			String sindan_url = driver.findElements(By.xpath("//a[@role='button']")).get(i).getAttribute(TAG_HREF);
			// WEB診断
			driver.get(sindan_url);
			// 1秒待ち
			Thread.sleep(1000);
			// 「次へ」
			driver.findElement(By.className(C_SUBMINT)).click();
			// 2秒待ち
			Thread.sleep(2000);
			// 「次へ」
			driver.findElement(By.className(C_SUBMINT)).click();
			// 1秒待ち
			Thread.sleep(1000);
			// 「診断質問」
			for(int line = 1; line <= 15; line++){
				String div_id = "group-" + line;
				String str_xpath = "//div[@id='" + div_id + "']/label[@class='label']";
				int choices_count = driver.findElements(By.xpath(str_xpath)).size();
				if(choices_count > 0){
					driver.findElements(By.xpath(str_xpath)).get(int_random(choices_count)).click();
					if(line == 15){
						// 「終了」
						driver.findElement(By.className(C_END)).click();
						break;
					}else{
						// 「次へ」
						driver.findElement(By.className(C_BTN)).click();
					}
				}else{
					break;
				}
			}
			// 「ポイント獲得」
			driver.findElement(By.className(C_END)).click();
			// 「アラート」
			driver.switchTo().alert().accept();
		}
		return Boolean.TRUE;
	}

}
