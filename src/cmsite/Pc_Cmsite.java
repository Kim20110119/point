package cmsite;

import static common.constant.CmsiteConstants.*;

import org.openqa.selenium.By;

import common.Point;

/**
 * 【CMサイト】：共通処理
 *
 * @author kimC
 *
 */
public class Pc_Cmsite extends Point {

	public Pc_Cmsite() {
		// 【CMサイト】：ログイン画面
		driver.get(PC_LOGIN_URL);
		// 【CMサイト】：ログインメールアドレス
		driver.findElement(By.name("usermei")).sendKeys(PC_LOGIN_MAIL);
		// 【CMサイト】：ログインパスワード
		driver.findElement(By.name("password")).sendKeys(PC_LOGIN_PASSWORD);
		// 【CMサイト】：ログインボタン
		driver.findElement(By.name("btn_send")).click();
	}

}
