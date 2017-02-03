package pointmall;

import static common.constant.PointmailConstants.*;

import org.openqa.selenium.By;

import common.Point;

/**
 * 【プリぽん】：共通処理
 *
 * @author kimC
 *
 */
public class Pc_Pointmail extends Point {

	public Pc_Pointmail() {
		// 【プリぽん】：ログイン画面
		driver.get(PC_LOGIN_URL);
		// 【プリぽん】：ログインメールアドレス
		driver.findElement(By.id("email")).sendKeys(PC_LOGIN_MAIL);
		// 【プリぽん】：ログインパスワード
		driver.findElement(By.id("password")).sendKeys(PC_LOGIN_PASSWORD);
		// 【プリぽん】：ログインボタン
		driver.findElement(By.className("btn-main")).click();
	}

}
