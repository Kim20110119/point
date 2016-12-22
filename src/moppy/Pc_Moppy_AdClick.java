package moppy;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * =====================================================================================================================
 * モッピー：クリックキャンペン
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Moppy_AdClick {

	/**
	 * =====================================================================================================================
	 * モッピー：クリックキャンペン
	 * =====================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public static void main(String[] args) {
		try {

			// option.addArguments(
			// "--user-agent=Mozilla/5.0 (iPhone; CPU iPhone OS 6_0 like Mac OS
			// X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0
			// Mobile/10A5376e Safari/8536.25");
			List<String> proxyList = getProxyList();
			for(int i = 0; i < proxyList.size(); i++){
				System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--proxy-server=http://"+proxyList.get(i));
				option.addArguments("--proxy-bypass-list=localhost");
				WebDriver driver = new ChromeDriver(option);
				excute(driver);
				// 5秒待ち
				Thread.sleep(5000);
				driver.quit();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * =====================================================================================================================
	 * モッピー紹介URLへ遷移する
	 * =====================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public static void excute(WebDriver driver) {
		try{
			driver.get("http://moppy.jp/top.php?xGVJe1dd");
		}catch (Exception e){
		}
	}


	/**
	 * =====================================================================================================================
	 * Proxyサーバー一覧を取得する
	 * =====================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public static List<String> getProxyList() {
		List<String> list=new ArrayList<String>();
		list.add("106.186.22.65:8888");
		list.add("219.127.253.43:80");
		list.add("219.166.7.50:80");
		list.add("43.229.204.102:8080");
		list.add("43.230.163.186:8080");
		list.add("43.231.23.101:8080");
		list.add("43.252.138.156:3128");
		list.add("121.94.173.145:80");
		list.add("160.202.40.203:8080");
		list.add("160.202.41.51:8080");
		list.add("160.202.42.10:8080");
		list.add("160.202.42.114:8080");
		list.add("160.202.42.122:8080");
		list.add("160.202.42.66:8080");
		list.add("160.202.42.74:8080");
		list.add("124.155.112.85:80");
		list.add("124.32.141.184:3128");
		return list;
	}

}
