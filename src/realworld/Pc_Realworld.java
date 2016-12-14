package realworld;

import static common.constant.PointConstants.*;

import org.openqa.selenium.By;

import common.Point;

/**
 * げん玉：共通処理
 *
 * @author kimC
 *
 */
public class Pc_Realworld extends Point {

	public Pc_Realworld() {
		// げん玉：ログイン画面
		driver.get(REALWORLD_LOGIN_URL);
		// げん玉：ログインメールアドレス
		driver.findElement(By.id("rwsid")).sendKeys(REALWORLD_LOGIN_MAIL);
		// げん玉：ログインパスワード
		driver.findElement(By.id("pass")).sendKeys(REALWORLD_LOGIN_PASSWORD);
		// げん玉：ログインボタン
		driver.findElement(By.name("login_page")).click();
	}

}
