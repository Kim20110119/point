package i2i;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * =====================================================================================================================
 * i2i：クリックキャンペン
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_I2i_AdClick {

	/**
	 * =====================================================================================================================
	 * i2i：クリックキャンペン
	 * =====================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public static void main(String[] args) {
		try {
			String proxy = "219.127.253.43:80";
			System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--proxy-server=http://"+proxy);
			option.addArguments("--proxy-bypass-list=localhost");
			WebDriver driver = new ChromeDriver(option);
			excute(driver);
			// 5秒待ち
			Thread.sleep(5000);
//			List<String> proxyList = getI2iProxyList();
//			for(int i = 0; i < proxyList.size(); i++){
//				System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
//				ChromeOptions option = new ChromeOptions();
//				option.addArguments("--proxy-server=http://"+proxyList.get(i));
//				option.addArguments("--proxy-bypass-list=localhost");
//				WebDriver driver = new ChromeDriver(option);
//				excute(driver);
//				// 5秒待ち
//				Thread.sleep(5000);
//				driver.quit();
//			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * =====================================================================================================================
	 * i2i紹介URLへ遷移する
	 * =====================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public static void excute(WebDriver driver) {
		try{
			driver.get("http://point.i2i.jp?inv=f8228");
		}catch (Exception e){
		}
	}

}
