package gendama;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UnitGendama {

	public static void main(String[] args) {
		// Chromeドライバーをプロパティへ設定
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		// ユーザーエージェントを上書きして、起動する
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--user-agent=Mozilla/5.0 (iPhone; CPU iPhone OS 6_0 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0 Mobile/10A5376e Safari/8536.25");
		WebDriver driver = new ChromeDriver(options);
//
//		// 画面サイズを指定する
//		driver.manage().window().setSize(new Dimension(320, 700));

		driver.get("http://www.gendama.jp/forest/");

	}

}
