package pointi.enquete;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * ポイントインカムWEBインタビュー
 *
 */
public class WebInterview {

	/** 定数 */
	public static final String URL = "http://pointi.jp/";               // ポイントインカムURL
    public static final String LOGIN_MAIL = "kim20110119@hotmail.com"; // ログインメールアドレス
    public static final String LOGIN_PASSWORD = "20110119Jjz";        // ログインパスワード

	public static void main(String[] args) {
		try{
			System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
			WebDriver web_interview = new ChromeDriver();
			web_interview.get(URL);
			web_interview.wait(2000);
			web_interview.quit();
		}
		catch (InterruptedException ie){
			System.out.print("error");
		}

	}

}
