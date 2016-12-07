package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Point {
	// WEBドライバー
	public WebDriver driver;
	/**
	 * システムプロパティにChromeドライバーを設定する
	 *
	 * @author kimC
	 *
	 */
	public Point(){
		// Chromeドライバーをプロパティへ設定
		System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
		// Chromeドライバー
		driver = new ChromeDriver();
	}
}
