package hapitas;

import static common.constant.HapitasConstants.*;

import org.openqa.selenium.By;

import common.Point;

/**
 * 【ハピタス】：共通処理
 *
 * @author kimC
 *
 */
public class Pc_Hapitas extends Point {

	/**
	 * コンストラクタ
	 */
	public Pc_Hapitas() {

	}

	/**
	 * =================================================================================================================
	 * ログイン処理
	 * =================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public void login(){
		try{
			// 【ハピタス】：ログイン画面
			driver.get(PC_LOGIN_URL);
			// 【ハピタス】：ログインメールアドレス
			driver.findElement(By.id("email_main")).sendKeys(PC_LOGIN_MAIL);
			// 【ハピタス】：ログインパスワード
			driver.findElement(By.id("password_main")).sendKeys(PC_LOGIN_PASSWORD);
			// 10秒待ち
			sleep(10000);
			// ロボットチェック
			driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
			Boolean loginFlag = Boolean.TRUE;
			// 1時間後に手動でログインしてない場合、自動でログインするようにする(※　認証してないとログインエラー表示)
			for(int i = 0; i < 3600; i++){
				// 現在のURLを取得する
				String url = driver.getCurrentUrl();
				// ログイン後URLかを判断する
				if(url.equals("http://hapitas.jp/mypage/")){
					loginFlag = Boolean.FALSE;
					break;
				}
				// 10秒待ち
				sleep(1000);
			}
			if(loginFlag){
				// 【ハピタス】：ログインボタン
				driver.findElement(By.className("btn_login_main_white")).click();
			}
		}catch (Exception e){
			System.out.println("【エラー】：ログイン失敗しました。");
			driver.quit();
		}
	}

	/**
	 * =================================================================================================================
	 * リダイレクトログイン処理
	 * =================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public void redirect_login(){
		try{
			// 【ハピタス】：ログインメールアドレス
			driver.findElement(By.id("email_main")).sendKeys(PC_LOGIN_MAIL);
			// 【ハピタス】：ログインパスワード
			driver.findElement(By.id("password_main")).sendKeys(PC_LOGIN_PASSWORD);
			// 10秒待ち
			sleep(10000);
			// 【ハピタス】：ログインボタン
			driver.findElement(By.className("btn_login_main_white")).click();
		}catch (Exception e){
			System.out.println("【エラー】：リダイレクトログイン失敗しました。");
			driver.quit();
		}
	}

}
