package pointi;

import static common.constant.PointConstants.*;

import org.openqa.selenium.By;

import common.Point;

/**
 * ポイントインカム：共通処理
 *
 * @author kimC
 *
 */
public class Pc_Pointi extends Point {
	/** 「email_address」 */
	private static final String N_E_A = "email_address";
	/** 「password」 */
	private static final String N_P = "password";
	/** 「submit」 */
	private static final String N_S = "submit";

	/**
	 * Pointiコンストラクタ
	 */
	public Pc_Pointi() {
		// 「ログイン画面」
		driver.get(POINTI_LOGIN_URL);
		// 「メールアドレス」
		driver.findElement(By.name(N_E_A)).sendKeys(POINTI_LOGIN_MAIL);
		// 「パスワード」
		driver.findElement(By.name(N_P)).sendKeys(POINTI_LOGIN_PASSWORD);
		// 「ログインボタン」
		driver.findElement(By.name(N_S)).click();
	}
}
