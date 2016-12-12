package gendama.mrga;

import static common.constant.HtmlConstants.*;
import static common.constant.PointConstants.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common.shindan.Diagnosis;

/**
 * =====================================================================================================================
 * げん玉：モリモリアンケート
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Gendama_DiagnosisMediaAd {

	public static final String C_ENQUETE_BOX = "enqueteBox";

	/**
	 * コンストラクタ
	 */
	public Gendama_DiagnosisMediaAd(){
		// Chromeドライバーをプロパティへ設定
		System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
	}
	//=================================================================================================================
	// モリモリアンケート
	//=================================================================================================================
	public String execute(){
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
			// げん玉：モリゲー
			driver.get(GENDAMA_AD_ENQ_LIST_URL);
			// げん玉：モリモリアンケート件数
			int enquete_count = driver.findElement(By.className(C_ENQUETE_BOX)).findElements(By.tagName(T_A)).size();
			for(int interview_index = 1; interview_index < enquete_count;interview_index++){
				// 「モリモリアンケートURL」
				String morimori_link = driver.findElement(By.className(C_ENQUETE_BOX)).findElements(By.tagName(T_A)).get(interview_index).getAttribute(A_HREF);
				// 「モリモリアンケート」タイトルを取得する
				String titel_text = driver.findElement(By.className(C_ENQUETE_BOX)).findElements(By.xpath("//dd[@class='title']")).get(interview_index).findElement(By.tagName(T_STRONG)).getText();
				if(titel_text.matches(S_SINDAN)){
					Diagnosis.execute(driver, morimori_link);
		        }
				driver.get(GENDAMA_AD_ENQ_LIST_URL);
			}
			return "";
		}catch(Exception e){
			System.out.println(e.getMessage());
			driver.quit();
			return "";
		}
	}
}
