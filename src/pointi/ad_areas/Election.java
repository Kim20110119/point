package pointi.ad_areas;

import static common.Common.*;
import static common.constant.HtmlConstants.*;
import static common.constant.PointConstants.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * =====================================================================================================================
 * ポイントインカム：クマクマ総選挙
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Election {
	/** 「email_address」 */
	private static final String N_E_A = "email_address";
	/** 「password」 */
	private static final String N_P = "password";
	/** 「submit」 */
	private static final String N_S = "submit";

	/** 「daily-points」 */
	private static final String C_D_P = "daily-points";

	/**
	 * コンストラクタ
	 */
	public Election(){
		// Chromeドライバーをプロパティへ設定
		System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
	}
	/**
	 * =================================================================================================================
	 * クマクマ総選挙
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
			String election_url = driver.findElement(By.className(C_D_P)).findElements(By.tagName(T_A)).get(4).getAttribute(A_HREF);
			// 「クマクマ調査団画面」
			driver.get(election_url);
			// 「さっそく投票を始める！」
			driver.findElement(By.className("start__button")).click();
			// 「投票画面」
			driver.findElement(By.className("select__list")).findElements(By.tagName(T_A)).get(0).click();
			// 「投票処理」
			for(int i = 0; i < 500; i++){
				// 「投票選択肢カウント」
				int choice_count = driver.findElements(By.xpath("//label[@class='radio']")).size();
				// 「投票選択肢」クリック
				driver.findElements(By.xpath("//label[@class='radio']")).get(int_random(choice_count)).click();
				// 1秒待ち
				Thread.sleep(1000);
				// 「次へ」ボタン
				driver.findElement(By.className("button--answer")).click();
				// 1秒待ち
				Thread.sleep(1000);
				// 「次の投票へ」
				driver.findElement(By.className("button__box")).findElements(By.tagName(T_A)).get(0).click();
				// 1秒待ち
				Thread.sleep(1000);
				// 獲得ポイントカウント
				point_count += 10;
			}
			return point_count;
		}catch(Exception e){
			System.out.println(e.getMessage());
			driver.quit();
			return point_count;
		}
	}

}
