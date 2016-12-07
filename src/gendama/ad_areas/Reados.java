package gendama.ad_areas;

import static common.constant.HtmlConstants.*;
import static common.constant.PointConstants.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common.enquete.Enquete;

/**
 * =====================================================================================================================
 * げん玉：クマクマ調査団
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Reados {

	/** 「daily-points」 */
	private static final String C_D_P = "daily-points";
	/** 「enquete_box」 */
	private static final String C_E_B = "enquete_box";



	/**
	 * コンストラクタ
	 */
	public Reados(){
		// Chromeドライバーをプロパティへ設定
		System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
	}
	/**
	 * =================================================================================================================
	 * クマクマ調査団
	 * =================================================================================================================
	 *
	 * @param WebDriver driver
	 * @param String url
	 *
	 * @author kimC
	 *
	 */
	public Integer execute(){
		// 「獲得ポイント」
		int point_count = 0;
		// Chromeドライバー
		WebDriver driver = new ChromeDriver();
		try{
			// げん玉：ログイン画面
			driver.get(GENDAMA_LOGIN_URL);
			// げん玉：ログインメールアドレス
			driver.findElement(By.id("rwsid")).sendKeys(GENDAMA_LOGIN_MAIL);
			// げん玉：ログインパスワード
			driver.findElement(By.id("pass")).sendKeys(GENDAMA_LOGIN_PASSWORD);
			// げん玉：ログインボタン
			driver.findElement(By.name("login_page")).click();
			// 「CMくじ」
			driver.get(GENDAMA_CM_URL);
			// 「クマクマ調査団URL」
			String reados_url = driver.findElement(By.className(C_D_P)).findElements(By.tagName(T_A)).get(5).getAttribute(A_HREF);
			// 「クマクマ調査団画面」
			driver.get(reados_url);
			// アンケート件数
			int enquete_count = driver.findElement(By.className(C_E_B)).findElements(By.tagName(T_A)).size();
			System.out.println(enquete_count);
			// 「獲得ポイント」
			for(int i = 0; i < enquete_count;i++){
				// 「アンケートURL」
				String enquete_url = driver.findElement(By.className(C_E_B)).findElements(By.tagName(T_A)).get(0).getAttribute(A_HREF);
				// 「アンケート回答」
				if(Enquete.execute(driver, enquete_url)){
					point_count += 10;
				}
				driver.get(reados_url);
			}
			return point_count;
		}catch(Exception e){
			System.out.println(e.getMessage());
			driver.quit();
			return point_count;
		}
	}
}
