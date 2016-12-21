package moppy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pc_Moppy_AdClick {

	public static void main(String[] args) {
		try{
			System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
	        ChromeOptions option = new ChromeOptions();
//	        option.addArguments(
//					"--user-agent=Mozilla/5.0 (iPhone; CPU iPhone OS 6_0 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0 Mobile/10A5376e Safari/8536.25");
	        option.addArguments("--proxy-server=http://50.206.36.254:3128");
	        option.addArguments("--proxy-bypass-list=localhost");
	        WebDriver driver = new ChromeDriver(option);
	        driver.get("http://moppy.jp/top.php?xGVJe1dd");
	        // １秒待ち
	     	Thread.sleep(1000);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
