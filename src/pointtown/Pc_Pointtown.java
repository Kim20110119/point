package pointtown;

import static common.constant.PointtownConstants.*;

import org.openqa.selenium.By;

import common.Point;

/**
 * 【ポイントタウン】：共通処理
 *
 * @author kimC
 *
 */
public class Pc_Pointtown extends Point {

	public Pc_Pointtown() {
		// 【ポイントタウン】：ログイン画面
		driver.get(PC_LOGIN_URL);
		// 【ポイントタウン】：ログインメールアドレス
		driver.findElement(By.id("uid")).sendKeys(PC_LOGIN_MAIL);
		// 【ポイントタウン】：ログインパスワード
		driver.findElement(By.id("password")).sendKeys(PC_LOGIN_PASSWORD);
		// 【ポイントタウン】：ログインボタン
		driver.findElement(By.xpath("//input[@alt='ログイン']")).click();
		// 【ポイントタウン】：回答
		driver.findElement(By.name("answer")).sendKeys("めいこ");
		sleep(5000);
		// 【ポイントタウン】：送信ボタン
		driver.findElement(By.xpath("//input[@alt='送信']")).click();
	}

}
