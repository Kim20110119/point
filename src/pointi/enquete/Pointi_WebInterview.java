package pointi.enquete;

import static common.constant.HtmlConstants.*;
import static common.constant.PointConstants.*;

import org.openqa.selenium.By;

import common.enquete.Adsurvey_Enquete;
import pointi.Pc_Pointi;

/**
 * =====================================================================================================================
 * ポイントインカム：Webインタビュー
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pointi_WebInterview extends Pc_Pointi {

	/** 「colm」 */
	private static final String C_C= "colm";
	/** 「獲得済みポイント」 */
	int point_count = 0;
	/** 「WEBインタビューURL」 */
	String interview_url;
	/**
	 * コンストラクタ
	 */
	public Pointi_WebInterview(){
	}
	/**
	 * =================================================================================================================
	 * WEBインタビュー
	 * =================================================================================================================
	 *
	 * @param WebDriver
	 *            driver
	 * @param String
	 *            url
	 *
	 * @author kimC
	 *
	 */
	public Integer execute() {
		try{
			// 「WEBインタビュー」
			driver.get(POINTI_RESEARCH_URL);
			// 「ポイントインカム」WEBインタビューリンクを取得する
			String interview_link = driver.findElements(getByClass(C_C)).get(0).findElement(By.tagName(T_A)).getAttribute(A_HREF);
			// 「ポイントインカム」WEBインタビュー一覧画面へ遷移する
			driver.get(interview_link);
			// 0.5秒待ち
			sleep(500);
			// WEBインタビュー件数を取得する
			int interview_count = getSize(getByXpath(T_A, A_TARGET, V_BLANK));
			for(int i = 0; i < interview_count; i++){
				start();
				// 「ポイントインカム」WEBインタビュー一覧画面へ遷移する
				driver.get(interview_link);
	        }
			driver.quit();
			return point_count;
		}catch (Exception e){
			driver.quit();
			System.out.println("【エラー】：ポイントインカムクマクマ総選挙失敗");
			return point_count;
		}

	}

	/**
	 * =================================================================================================================
	 * WEBインタビュースタート
	 * =================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public void start() {
		try {
			// WEBインタビューのURLへ取得する
            interview_url = driver.findElements(getByXpath(T_A, A_TARGET, V_BLANK)).get(0).getAttribute(A_HREF);
            // WEBインタビューのURLへ遷移する
            driver.get(interview_url);
			// 「アンケート回答」
			if (Adsurvey_Enquete.execute(driver)) {
				point_count += 10;
			}
		} catch (Exception e) {
			System.out.println("【エラー】：WEBインタビュー失敗");
			Adsurvey_Enquete.execute_restart(driver);
		}
	}

}
