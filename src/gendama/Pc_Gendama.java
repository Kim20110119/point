package gendama;

import static common.constant.PointConstants.*;

import org.openqa.selenium.By;

import common.Point;

/**
 * げん玉：共通処理
 *
 * @author kimC
 *
 */
public class Pc_Gendama extends Point {

	public Pc_Gendama() {
		// げん玉：ログイン画面
		driver.get(GENDAMA_LOGIN_URL);
		// げん玉：ログインメールアドレス
		driver.findElement(By.id("rwsid")).sendKeys(GENDAMA_LOGIN_MAIL);
		// げん玉：ログインパスワード
		driver.findElement(By.id("pass")).sendKeys(GENDAMA_LOGIN_PASSWORD);
		// げん玉：ログインボタン
		driver.findElement(By.name("login_page")).click();
	}

}
