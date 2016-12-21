package chobirich;

import static common.constant.PointConstants.*;

import org.openqa.selenium.By;

import common.Point;

/**
 * ちょびリッチ：共通処理
 *
 * @author kimC
 *
 */
public class Pc_Chobirich extends Point {

	public Pc_Chobirich() {
		// ちょびリッチ：ログイン画面
		driver.get(CHOBIRICH_LOGIN_URL);
		// ちょびリッチ：ログインメールアドレス
		driver.findElement(By.id("form_uid")).sendKeys(CHOBIRICH_LOGIN_MAIL);
		// ちょびリッチ：ログインパスワード
		driver.findElement(By.id("form_pswd")).sendKeys(CHOBIRICH_LOGIN_PASSWORD);
		// 5秒待ち
		sleep(5000);
		// ちょびリッチ：ログインボタン
		driver.findElement(By.className("submit")).click();
	}

}
