package pointi.ad_areas;

import static common.constant.HtmlConstants.*;
import static common.constant.PointConstants.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common.enquete.Enquete;

/**
 * =====================================================================================================================
 * ポイントインカム：クマクマ調査団
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Reados {

	/** 「email_address」 */
	private static final String N_E_A = "email_address";
	/** 「password」 */
	private static final String N_P = "password";
	/** 「submit」 */
	private static final String N_S = "submit";

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
			// 「ログイン画面」
			driver.get(POINTI_LOGIN_URL);
			// 1秒待ち
			Thread.sleep(1000);
		    // 「メールアドレス」
		    driver.findElement(By.name(N_E_A)).sendKeys(POINTI_LOGIN_MAIL);
		    // 「パスワード」
		    driver.findElement(By.name(N_P)).sendKeys(POINTI_LOGIN_PASSWORD);
		    // 「ログインボタン」
		    driver.findElement(By.name(N_S)).click();
			// 「CMくじ」
			driver.get(POINTI_CF_URL);
			// 「クマクマ調査団URL」
			String reados_url = driver.findElement(By.className(C_D_P)).findElements(By.tagName(T_A)).get(3).getAttribute(A_HREF);
			// 「クマクマ調査団画面」
			driver.get(reados_url);
			// アンケート件数
			int enquete_count = driver.findElement(By.className(C_E_B)).findElements(By.tagName(T_A)).size();
			System.out.println(enquete_count);
			// 「獲得ポイント」
			for(int i = 1; i < enquete_count;i++){
				// 「アンケートURL」
				String enquete_url = driver.findElement(By.className(C_E_B)).findElements(By.tagName(T_A)).get(1).getAttribute(A_HREF);
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
