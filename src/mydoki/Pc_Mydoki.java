package mydoki;

import static common.constant.MydokiConstants.*;

import org.openqa.selenium.By;

import common.Point;

/**
 * 【mydoki】：共通処理
 *
 * @author kimC
 *
 */
public class Pc_Mydoki extends Point {

	public Pc_Mydoki() {
//		// 【mydoki】：URL
//		driver.get(PC_URL);
//		// 【mydoki】：ログインボタン
//		driver.findElement(By.partialLinkText("ログイン")).click();
		// 【mydoki】：ログイン画面
		driver.get(PC_LOGIN_URL);
		sleep(2000);
		// 【mydoki】：ログインメールアドレス
		driver.findElement(By.id("id")).sendKeys(PC_LOGIN_MAIL);
		// 【mydoki】：ログインパスワード
		driver.findElement(By.id("password")).sendKeys(PC_LOGIN_PASSWORD);
		sleep(2000);
		// 【mydoki】：ログインボタン
		driver.findElement(By.xpath("//input[@value='ログイン']")).click();
	}

}
