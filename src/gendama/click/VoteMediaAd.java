package gendama.click;

import static common.constant.PointConstants.*;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * =====================================================================================================================
 * げん玉：みんなで多数決
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class VoteMediaAd {

	//=================================================================================================================
	// みんなで多数決
	//=================================================================================================================
	public static void main(String[] args) {
		// Chromeドライバーをプロパティへ設定
		System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
		// Chromeドライバー
		WebDriver media_ad = new ChromeDriver();
		try{
			// げん玉：ログイン画面
			media_ad.get(GENDAMA_LOGIN_URL);
			// げん玉：ログインメールアドレス
			media_ad.findElement(By.id("rwsid")).sendKeys(GENDAMA_LOGIN_MAIL);
			// げん玉：ログインパスワード
			media_ad.findElement(By.id("pass")).sendKeys(GENDAMA_LOGIN_PASSWORD);
			// げん玉：ログインボタン
			media_ad.findElement(By.name("login_page")).click();
			// げん玉：モリゲー
			media_ad.get(GENDAMA_AD_ENQ_LIST_URL);
			// げん玉：みんなで多数決URL
			String morimori_link = media_ad.findElement(By.className("enqueteBox")).findElements(By.tagName("a")).get(0).getAttribute("href");
			//「げん玉」みんなで多数決画面
			media_ad.get(morimori_link);
			// １秒待ち
			Thread.sleep(1000);
			// 「さっそくスタート」
			media_ad.findElement(By.className("start__button")).click();
			String end_message = media_ad.findElement(By.className("next__none")).getText();
			// 本日の終了を判断する
			if(end_message.matches(GENDAMA_END_MESSAGE)){
				System.out.println(end_message);
				// ドライバー終了
				media_ad.quit();
			}else{
				// １秒待ち
				Thread.sleep(500);
				for(int index = 1; index < 200; index++){
					// 「ラジオボタン」
					int radio_count = media_ad.findElements(By.name("choice_id")).size();
					if(radio_count > 0){
						// Randomクラスのインスタンス化
						Random rnd = new Random();
						int answer = rnd.nextInt(radio_count);
						// 選択肢を選択する
						media_ad.findElements(By.xpath("//label[@class='radio']")).get(answer).click();
						// 「投票する」
						media_ad.findElement(By.xpath("//input[@value='投票する']")).click();
						// 0.5秒待ち
						Thread.sleep(3000);
						// 「次の質問へ」
						media_ad.findElement(By.className("button--next")).click();
					}
				}
				// ドライバー終了
				media_ad.quit();
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
			media_ad.quit();
		}

	}


}
