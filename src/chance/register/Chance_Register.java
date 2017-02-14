package chance.register;

import static common.constant.ChanceConstants.*;
import static common.constant.HtmlConstants.*;
import static common.Common.*;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import common.shindan.WebShindan;

/**
 * =====================================================================================================================
 * チャンスイット：登録
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Chance_Register{
	// WEBドライバー
	WebDriver driver;
	/** 「診断URL」 */
	String shindan_url  = StringUtils.EMPTY;
	/** 「獲得ポイント」 */
	int point_count = 0;
	/** 「再スタートフラグ」 */
	Boolean restart_flag = Boolean.FALSE;
	/** 「WEB診断開始番号」 */
	int start = 0;
	/** 「WEB診断終了番号」 */
	int end = 50;

	/**
	 * コンストラクタ
	 */
	public Chance_Register() {
		// Chromeドライバーをプロパティへ設定
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
	}

	/**
	 * =================================================================================================================
	 * チャンスイット：WEB診断
	 * =================================================================================================================
	 *
	 * @return int point_couont 獲得済みポイント
	 *
	 * @author kimC
	 *
	 */
	public Integer execute() {
		for (int i = 0; i < getMailList().size(); i++) {
			// Chromeドライバー
			driver = new ChromeDriver();
			// 「登録URL」
			driver.get(PC_REGISTER_URL);
			// 0.5秒待ち 
			sleep(500);
			// メールアドレス
			driver.findElement(By.name("email")).sendKeys(getMailList().get(i));
			// パスワード
			driver.findElement(By.name("password")).sendKeys(getPassList().get(i));
			// ニックネーム
			driver.findElement(By.name("nickname")).sendKeys(getNickNameList().get(i));
			// 年
			Select year = new Select(driver.findElement(By.name("birthday.0")));
			year.selectByValue(getYearList().get(i));
			// 月
			Select month = new Select(driver.findElement(By.name("birthday.1")));
			month.selectByValue(getMonthList().get(i));
			// 日
			Select day = new Select(driver.findElement(By.name("birthday.2")));
			day.selectByValue(getDayList().get(i));
			// 性別
			driver.findElements(By.name("sex")).get(int_random(2)).click();
			// 登録
			driver.findElement(By.id("register1")).click();
			// 仮登録
			driver.findElement(By.id("register2")).click();
			// 使い捨てメール画面
			driver.get(MAIL_URL);
			// 「他のアカウントにログイン（復元／同期）」をクリック
			driver.findElement(By.id("link_loginform")).click();
		    // 「ID」を入力する
			driver.findElement(By.id("user_number")).sendKeys(MAIL_ID);
		    // 「パスワード」を入力する
			driver.findElement(By.id("user_password")).sendKeys(MAIL_PASS);
		    // 1秒待ち
			sleep(1000);
		    // 「ログインする」ボタンのクリック
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("checkLogin();");
			// 1秒待ち
			sleep(1000);
		    // 「確認」をクリックする
			jse.executeScript("okConfirmDialog();");
			// 1秒待ち
			sleep(1000);
			driver.switchTo().alert().accept();
			// 1秒待ち
			sleep(1000);
			driver.switchTo().alert().accept();
			// 1秒待ち
			sleep(1000);
			// 「受信トレイ」をクリックする
			jse.executeScript("location.href='recv.php';");
			// 1秒待ち
			sleep(1000);
			String mail_id = driver.findElements(By.className("ui-listview")).get(1).findElement(By.tagName("li")).getAttribute("id");
			String mail_num = mail_id.split("_", 0)[2];
			String mail_detail_url = "https://m.kuku.lu/smphone.app.recv.data.php?UID=7b8dd910ef5598be68ace481984e263c&num=" + mail_num + "&detailmode=1";
			// メール内容詳細参照用ドライバー
			WebDriver mail_detail = new ChromeDriver();
			// メール内容詳細参照へ遷移する
			mail_detail.get(mail_detail_url);
			// 「トラフィック」仮登録用URLを取得する
			String chance_register_url = mail_detail.findElement(By.partialLinkText("https://www.chance.com/member/vcampaign.srv")) .getText();
			mail_detail.quit();
			driver.get(chance_register_url);
			driver.findElement(By.className("btn_top")).click();
			// 3秒待ち
			sleep(3000);
			driver.get("http://www.chance.com/research/");
			// 3秒待ち
			sleep(3000);
			String shindan_list_url = driver.findElement(By.id("research_movie")).findElement(By.tagName("a")).getAttribute("href");
			driver.get(shindan_list_url);
			for (int shindan_index = start; shindan_index < end; shindan_index++) {
				// 0.5秒待ち
				sleep(500);
				// 診断URL
				shindan_url = driver.findElements(By.xpath("//a[@role='button']")).get(shindan_index).getAttribute(A_HREF);
				// WEB診断
				driver.get(shindan_url);
				if (!start()) {
					restart();
				}
				// 「WEB診断」
				driver.get(shindan_list_url);
			}
			this.wifiRestart();
			// ブラウザを終了する
			driver.quit();
		}
		return point_count;
	}
	
	public Boolean start() {
		try {
			WebShindan.execute(driver);
			return Boolean.TRUE;
		} catch (Exception e) {
			System.out.println("【エラー】：WEB診断失敗");
			return Boolean.FALSE;
		}

	}

	public void restart() {
		try {
			// WEB診断
			driver.get(shindan_url);
			WebShindan.execute(driver);
		} catch (Exception e) {
			System.out.println("【エラー】：WEB診断再スタート失敗");
		}

	}
	
	/**
	 * =================================================================================================================
	 * WEBインタビュー
	 * =================================================================================================================
	 *
	 * @author kimCi
	 *
	 */
	public void wifiRestart() {
		driver.get("http://admin:20110119Jjz@192.168.179.1/index.cgi/reboot_main");
		driver.findElement(By.id("UPDATE_BUTTON")).click();
		driver.switchTo().alert().accept();
		sleep(100000);
		driver.switchTo().alert().accept();
	}
	
	/**
	 * sleep処理
	 *
	 * @param long
	 *            millis
	 */
	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
