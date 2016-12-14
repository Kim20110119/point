package common.shindan;

import static common.Common.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * =====================================================================================================================
 * 共通：おもしろ診断
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Diagnosis {

	/**
	 * =================================================================================================================
	 * おもしろ診断処理
	 * =================================================================================================================
	 *
	 * @param WebDriver driver
	 *
	 * @author kimC
	 *
	 */
	public static Boolean execute(WebDriver driver) throws Exception{
        // 0.5秒待ち
        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@value='さっそく診断を始める']")).click();
        for(int i = 1; i <= 20; i++){
        	// 「選択肢」カウント
            int radio_count = driver.findElements(By.xpath("//label[@class='radio']")).size();
            // 1秒待ち
            Thread.sleep(500);
            // 「選択肢」
            if(radio_count > 0){
            	driver.findElements(By.xpath("//label[@class='radio']")).get(int_random(radio_count)).click();
                // 「次へ」
                driver.findElement(By.xpath("//input[@value='次へ']")).click();
                // 1秒待ち
                Thread.sleep(1000);
            }else{
            	return Boolean.TRUE;
            }
        }
		return Boolean.TRUE;
	}

}
