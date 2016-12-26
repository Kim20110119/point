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

	public Pc_Hapitas() {
		// 【ハピタス】：ログイン画面
		driver.get(PC_LOGIN_URL);
		// 【ハピタス】：ログインメールアドレス
		driver.findElement(By.id("email_main")).sendKeys(PC_LOGIN_MAIL);
		// 【ハピタス】：ログインパスワード
		driver.findElement(By.id("password_main")).sendKeys(PC_LOGIN_PASSWORD);
		// 【ハピタス】：ログインボタン
		driver.findElement(By.className("btn_login_main_white")).click();
	}

}
