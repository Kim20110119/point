package point_land.enquete;

import static common.constant.HtmlConstants.*;
import static common.constant.PointLandConstants.*;

import common.enquete.Enta_Research;
import point_land.Pc_Point_Land;

/**
 * =====================================================================================================================
 * ポイントランド：アンケート&診断
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Point_Land_Enquete extends Pc_Point_Land {
	String originalHandel = "";
	/** 「アンケート&診断URL」 */
	String enquete_url;
	/** 「獲得済みポイント」 */
	int point_count = 0;

	/**
	 * コンストラクタ
	 */
	public Point_Land_Enquete() {
		// 「CMくじ」
		driver.get(POINT_LAND_ENQUETE_URL);
		originalHandel = driver.getWindowHandle();
	}

	/**
	 * =================================================================================================================
	 * アンケート&診断メイン処理
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
		// アンケート件数
		int enquete_count = driver.findElements(getByXpath(T_INPUT, A_VALUE, "回答する")).size();
		// 「獲得ポイント」
		for (int i = 0; i < enquete_count; i++) {
			driver.findElements(getByXpath(T_INPUT, A_VALUE, "回答する")).get(i).click();
			urlByTab(originalHandel);
			// 調査スタート
			start();
		}
		driver.quit();
		return point_count;
	}

	/**
	 * =================================================================================================================
	 * アンケート回答スタート
	 * =================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public void start() {
		try {
			if (Enta_Research.execute(driver)) {
				point_count += 10;
				super.tab_close(driver, originalHandel);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("【エラー】：Adsurveyアンケート回答失敗!");
			super.tab_close(driver, originalHandel);
		}
	}

	/**
	 * =================================================================================================================
	 * タブを取得する
	 * =================================================================================================================
	 *
	 * @param WebDriver
	 *            driver
	 * @param String
	 *            originalHandle
	 * @param By
	 *            by
	 *
	 * @author kimC
	 *
	 */
	public void urlByTab(String originalHandle) {
		try {
			for (String handle : driver.getWindowHandles()) {
				if (!handle.equals(originalHandle)) {
					driver.switchTo().window(handle);
					driver.get(driver.getCurrentUrl());
				}
			}
		} catch (Exception e) {
		}

	}
}
