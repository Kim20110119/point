package moppy.ad_areas;

import static common.constant.CommonConstants.*;
import static common.constant.HtmlConstants.*;
import static common.constant.MoppyConstants.*;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import common.enquete.Manga_enquete;
import moppy.Pc_Moppy;

/**
 * =====================================================================================================================
 * モッピー：漫画アンケート
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Moppy_Ad_Enquete extends Pc_Moppy {
	/** 「daily-points」 */
	private static final String C_D_P = "daily-points";
	/** 「漫画アンケートURL」 */
	String enquete_link;
	/** 「獲得ポイント」 */
	int point_count = 0;
	/** 「再スタートフラグ」 */
	Boolean restart_flag = Boolean.FALSE;
	/** 「アンケート件数」 */
	int enquete_count = 0;
	/** 開始Index */
	int start = 0;
	/** 終了Index */
	int end = 12;

	/**
	 * コンストラクタ
	 */
	public Moppy_Ad_Enquete() {
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
			// 「CMくじ」
			driver.get(PC_CM_URL);
			// 「漫画アンケートURL」取得する
			enquete_link = driver.findElement(By.className(C_D_P)).findElements(By.tagName(T_A)).get(INT_5)
					.getAttribute(A_HREF);
			if (StringUtils.isNoneEmpty(enquete_link)) {
				// 「漫画アンケート画面」
				driver.get(enquete_link);
				// 「漫画アンケート」件数
				enquete_count = driver.findElements(By.partialLinkText("回答する")).size();
				if(enquete_count < end){
					end = enquete_count;
				}
				// 「漫画アンケート」回答処理
				for(int i = start; i < end; i++){
					String enquete_url = driver.findElements(By.partialLinkText("回答する")).get(0).getAttribute(A_HREF);
					driver.get(enquete_url);
					start();
					// 「漫画アンケート画面」
					driver.get(enquete_link);
				}
				// 獲得ポイントカウント
				point_count += 10;
			} else {
				System.out.println("=====漫画アンケートURL取得失敗");
			}
			driver.quit();
			return point_count;
		} catch (Exception e) {
			driver.quit();
			System.out.println("===漫画アンケート失敗");
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
			System.out.println("=====【エラー】：漫画アンケート失敗！");
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
			Manga_enquete.execute(driver);
		} catch (Exception e) {
			System.out.println("=====【エラー】：漫画アンケート再スタート失敗！");
		}
	}

}
