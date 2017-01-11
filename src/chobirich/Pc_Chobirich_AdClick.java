package chobirich;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * =====================================================================================================================
 * ちょびリッチ：ADクリック
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Chobirich_AdClick {

	/**
	 * =====================================================================================================================
	 * ちょびリッチ：ADクリック
	 * =====================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			for(int i = 20650; i < 22000; i++){
				 String url = "http://www.chobirich.com/cm/ad/?p=82235"+i+"&i=2973007";
				 driver.get(url);
				// 5秒待ち
				Thread.sleep(500);
			}
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
