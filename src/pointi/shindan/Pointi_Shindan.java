package pointi.shindan;

import static common.constant.HtmlConstants.*;
import static common.constant.PointConstants.*;

import org.openqa.selenium.By;

import common.shindan.WebShindan;
import pointi.Pointi;

/**
 * =====================================================================================================================
 * ポイントインカム：WEB診断
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pointi_Shindan  extends Pointi {
	/** 「クマクマ総選挙URL」 */
	String election_url;
	/** 「獲得ポイント」 */
	int point_count = 0;
	/** 「再スタートフラグ」 */
	Boolean restart_flag = Boolean.FALSE;
	/** 「WEB診断開始番号」 */
	int start = 0;
	/** 「WEB診断終了番号」 */
	int end = 4;

	/**
	 * コンストラクタ
	 */
	public Pointi_Shindan() {
		// 「WEB診断」
		driver.get(POINTI_WEB_SHINDAN_URL);
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
		for(int i = start; i < end; i++){
			// 0.5秒待ち
			sleep(500);
			// 診断URL
			String sindan_url = driver.findElements(By.xpath("//a[@role='button']")).get(i).getAttribute(A_HREF);
			// WEB診断
			driver.get(sindan_url);
			if(start()){
				point_count += 10;
			}else{
				restart();
			}
		// 「WEB診断」
		driver.get(POINTI_WEB_SHINDAN_URL);
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
