package mydoki.shindan;

import static common.constant.HtmlConstants.*;

import org.openqa.selenium.By;

import common.shindan.WebShindan;
import mydoki.Pc_Mydoki;

/**
 * =====================================================================================================================
 * プリぽん：WEB診断
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Mydoki_Shindan  extends Pc_Mydoki {
	/** 「クマクマ総選挙URL」 */
	String election_url;
	/** 「獲得ポイント」 */
	int point_count = 0;
	/** 「再スタートフラグ」 */
	Boolean restart_flag = Boolean.FALSE;
	/** 「WEB診断開始番号」 */
	int start = 0;
	/** 「WEB診断終了番号」 */
	int end = 200;

	/**
	 * コンストラクタ
	 */
	public Mydoki_Shindan() {
	}

	/**
	 * =================================================================================================================
	 * ポイントインカム：WEB診断
	 * =================================================================================================================
	 *
	 * @return int point_couont 獲得済みポイント
	 *
	 * @author kimC
	 *
	 */
	public Integer execute() {
		String app_url = driver.findElement(By.className("navi-menu-appli")).getAttribute(A_HREF);
		// 1秒待ち
		sleep(1000);
		driver.get(app_url);
		// 1秒待ち
		sleep(1000);
		driver.findElement(By.className("clearfix")).findElements(By.tagName(T_LI)).get(1).findElement(By.tagName(T_A)).click();
		for(int i = 0; i < 200; i++){
			// 1秒待ち
			sleep(1000);
			driver.findElement(By.className("ow-item-list")).findElements(By.tagName(T_LI)).get(i).click();
			driver.findElements(By.className("btn-site")).get(0).click();
			// 0.5秒待ち
			sleep(500);
			if(start()){
				point_count += 10;
			}else{
				restart();
			}
			// 0.5秒待ち
			sleep(5000);
			driver.get(app_url);
			driver.findElement(By.className("clearfix")).findElements(By.tagName(T_LI)).get(1).findElement(By.tagName(T_A)).click();
		}
		driver.quit();
		return point_count;
	}

	public Boolean start() {
		try {
			WebShindan.execute(driver);
			return Boolean.TRUE;
		} catch (Exception e) {
			System.out.println("===WEB診断失敗");
			return Boolean.FALSE;
		}

	}

	public void restart() {
		try {
			WebShindan.execute(driver);
			point_count += 10;
		} catch (Exception e) {
			System.out.println("===WEB診断再スタート失敗");
		}

	}

}
