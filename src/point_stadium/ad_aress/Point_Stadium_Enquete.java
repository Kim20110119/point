package point_stadium.ad_aress;

import static common.constant.HtmlConstants.*;
import static common.constant.pointStadiumConstants.*;
import static common.constant.CommonConstants.*;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import common.enquete.Manga_enquete;
import point_stadium.Pc_Point_Stadium;

/**
 * =====================================================================================================================
 * げん玉：漫画アンケート
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Point_Stadium_Enquete extends Pc_Point_Stadium {
	/** 「daily-points」 */
	private static final String C_D_P = "daily-points";
	/** 「漫画アンケートリンク」 */
	String enquete_link;
	/** 「漫画アンケートURL」 */
	String enquete_url;
	/** 「獲得ポイント」 */
	int point_count = 0;
	/** 「再スタートフラグ」 */
	Boolean restart_flag = Boolean.FALSE;
	/** 「アンケート件数」 */
	int enquete_count = 0;

	/**
	 * コンストラクタ
	 */
	public Point_Stadium_Enquete() {
		// 「CMくじ」
		driver.get(PC_CM_URL);
		driver.findElement(By.xpath("//input[@value='ＣＭでポイントに参加']")).click();
		String originalHandel = driver.getWindowHandle();
		String cm_url = super.getUrlByTab(driver, originalHandel);
		driver.get(cm_url);
	}

	/**
	 * =================================================================================================================
	 * 漫画アンケート
	 * =================================================================================================================
	 *
	 * @return int point_couont 獲得済みポイント
	 *
	 * @author kimC
	 *
	 */
	public Integer execute() {
		try {
			// 「漫画アンケートURL」取得する
			enquete_link = driver.findElement(By.className(C_D_P)).findElements(By.tagName(T_A)).get(INT_2)
					.getAttribute(A_HREF);
			if (StringUtils.isNoneEmpty(enquete_link)) {
				// 「漫画アンケート画面」
				driver.get(enquete_link);
				int enquete_count = driver.findElements(By.partialLinkText("回答する")).size();
				for (int i = 0; i < enquete_count; i++) {
					enquete_url = driver.findElements(By.partialLinkText("回答する")).get(0).getAttribute(A_HREF);
					driver.get(enquete_url);
					start();
					// 「漫画アンケート画面」
					driver.get(enquete_link);
				}
				// 獲得ポイントカウント
				point_count += 10;
			} else {
				System.out.println("【エラー】：漫画アンケートURL取得失敗");
			}
			driver.quit();
			return point_count;
		} catch (Exception e) {
			driver.quit();
			System.out.println("【エラー】：漫画アンケート失敗");
			return point_count;
		}
	}

	/**
	 * =================================================================================================================
	 * 投票スタート
	 * =================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public void start() {
		try {
			Manga_enquete.execute(driver);
		} catch (Exception e) {
			System.out.println("【エラー】：漫画アンケート失敗！");
			point_count -= 10;
			restart();
		}
	}

	/**
	 * =================================================================================================================
	 * 投票再スタート
	 * =================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public void restart() {
		try {
			driver.get(enquete_url);
			Manga_enquete.execute(driver);
		} catch (Exception e) {
			System.out.println("【エラー】：漫画アンケート再スタート失敗！");
		}
	}

}
