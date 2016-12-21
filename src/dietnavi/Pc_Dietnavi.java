package dietnavi;

import static common.constant.DietnaviConstants.*;

import org.openqa.selenium.By;

import common.Point;

/**
 * GetMoney：共通処理
 *
 * @author kimC
 *
 */
public class Pc_Dietnavi extends Point {

	public Pc_Dietnavi() {
		// GetMoney：ログイン画面
		driver.get(PC_LOGIN_URL);
		// GetMoney：ログインメールアドレス
		driver.findElement(By.name("mail")).sendKeys(PC_LOGIN_MAIL);
		// GetMoney：ログインパスワード
		driver.findElement(By.name("pass")).sendKeys(PC_LOGIN_PASSWORD);
		// 5秒待ち
		sleep(8000);
		// GetMoney：ログインボタン
		driver.findElement(By.name("login")).click();
	}

}
