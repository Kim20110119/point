package gendama;

import static common.constant.PointConstants.*;

import org.openqa.selenium.By;

import common.Sp_Point;

/**
 * 【げん玉】：共通処理
 *
 * @author kimC
 *
 */
public class Sp_Gendama extends Sp_Point {

	public Sp_Gendama() {
		// 【げん玉】：ログイン画面
		driver.get(GENDAMA_LOGIN_URL);
		// 【げん玉】：ログインメールアドレス
		driver.findElement(By.id("rwsid")).sendKeys(GENDAMA_LOGIN_MAIL);
		// 【げん玉】：ログインパスワード
		driver.findElement(By.id("pass")).sendKeys(GENDAMA_LOGIN_PASSWORD);
		// 【げん玉】：ログインボタン
		driver.findElement(By.className("loginBt")).findElement(By.tagName("a")).click();
	}

}
