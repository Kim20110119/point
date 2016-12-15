package i2i;

import static common.constant.PointConstants.*;

import org.openqa.selenium.By;

import common.Point;

/**
 * I2I：共通処理
 *
 * @author kimC
 *
 */
public class Pc_I2i extends Point {

	public Pc_I2i() {
		// I2I：ログイン画面
		driver.get(I2I_LOGIN_URL);
		// I2I：ログインメールアドレス
		driver.findElement(By.name("loginId")).sendKeys(I2I_LOGIN_MAIL);
		// I2I：ログインパスワード
		driver.findElement(By.name("loginPw")).sendKeys(I2I_LOGIN_PASSWORD);
		// I2I：ログインボタン
		driver.findElement(By.className("style-btn")).click();
	}

}
