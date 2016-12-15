package moppy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Moppy_AdClick {

	public static void main(String[] args) {
		try{
			System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
	        ChromeOptions option = new ChromeOptions();
	        option.addArguments("--proxy-server=http://124.155.112.85:80");
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
