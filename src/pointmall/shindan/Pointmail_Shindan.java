package pointmall.shindan;

import static common.Common.*;
import static common.constant.PointmailConstants.*;

import common.shindan.WebShindan;
import pointmall.Pc_Pointmail;

/**
 * =====================================================================================================================
 * プリぽん：WEB診断
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pointmail_Shindan  extends Pc_Pointmail {
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
	public Pointmail_Shindan() {
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
		for(int i = start; i < getPointmailAppIdList().size(); i++){
			String url = getPointmailAppIdList().get(i);
			driver.get(url);
			// 0.5秒待ち
			sleep(500);
			// 診断URL
			String shindan_url = driver.getCurrentUrl();
			if(shindan_url.matches(STR_SHINDAN_URL)){
				if(start()){
					point_count += 10;
				}else{
					restart();
				}
			}
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
