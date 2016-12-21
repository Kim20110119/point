package moppy.sp;

import static common.Common.*;
import static common.constant.HtmlConstants.*;
import static common.constant.PointConstants.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import moppy.Sp_Moppy;

/**
 * =====================================================================================================================
 * モッピー：毎日クリックコイン
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Sp_Moppy_Click_Coin  extends Sp_Moppy {
	/** 「cc__bnr」 */
	private static final String C_C_B = "cc__bnr";
	/** 「cc-btn」 */
	private static final String C_C_B_N = "cc-btn";
	/** 「data」 */
	private static final String C_D = "data";
	/** 「ts-nink」 */
	private static final String I_T_N = "ts-nink";

	/** 「毎日クリックコインURL」 */
	String shindan_link;
	/** 「獲得ポイント」 */
	int point_count = 0;
	/** 「毎日クリックコイン開始番号」 */
	int start = 0;
	/** 「毎日クリックコイン終了番号」 */
	int end = 11;
	/** 「毎日クリックコインURL」 */
	String sindan_url;

	/**
	 * コンストラクタ
	 */
	public Sp_Moppy_Click_Coin() {
		// 「毎日クリックコイン」
		driver.get(MOPPY_CLICK_COIN_URL);
	}

	/**
	 * =================================================================================================================
	 * モッピー：毎日クリックコイン
	 * =================================================================================================================
	 *
	 * @return int point_couont 獲得済みポイント
	 *
	 * @author kimC
	 *
	 */
	public Integer execute() {

		// モッピー画面のタブ名を取得する
		String original = driver.getWindowHandle();
		ad_close(driver);
		for(int i = 0; i < 100; i++){
			// モッピー画面のタブ名を取得する
			String originalHandel = driver.getWindowHandle();
			click(originalHandel);
			// タブをクリックする
			tab_close(driver,originalHandel);
			point_count++;
		}
		one_click(original);
		driver.quit();
		return point_count/10;
	}

	/**
	 * =================================================================================================================
	 * モッピー：毎日クリック50コイン処理
	 * =================================================================================================================
	 *
	 *
	 * @param String originalHandel モッピー画面タグ名
	 *
	 * @author kimC
	 *
	 */
	public void click(String originalHandel) {
		try{
			// バナーをクリックする
			click(getByClass(C_C_B));
			// タブを移動する
			super.getUrlByTab(driver, originalHandel);
			// 都道府県件数を取得する
			int pref_count = driver.findElement(By.id(I_T_N)).findElements(By.tagName(T_LI)).size();
			// 都道府県条件として、クリックする
			driver.findElement(By.id(I_T_N)).findElements(By.tagName(T_LI)).get(int_random(pref_count)).click();
			// 店件数を取得する
			int shop_count = driver.findElements(By.className(C_D)).size();
			// 店をクリックする
			driver.findElements(By.className(C_D)).get(int_random(shop_count)).findElement(By.tagName(T_A)).click();
		}catch (Exception e){

		}
	}

	/**
	 * =================================================================================================================
	 * モッピー：毎日クリック1コイン処理
	 * =================================================================================================================
	 *
	 *
	 * @param String originalHandel モッピー画面タグ名
	 *
	 * @author kimC
	 *
	 */
	public void one_click(String originalHandel) {
		try{
			int one_click_count = getSize(getByClass(C_C_B_N));
			for(int i = 0; i < one_click_count; i ++){
				driver.findElements(By.className(C_C_B_N)).get(i).click();
			}
		}catch (Exception e){

		}
	}

	/**
	 * =================================================================================================================
	 * タブを閉じる
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
	public static void tab_close(WebDriver driver, String originalHandle) {
		try {
			for (String handle : driver.getWindowHandles()) {
				if (!handle.equals(originalHandle)) {
					driver.switchTo().window(handle);
					driver.close();
				}
			}
			driver.switchTo().window(originalHandle);

		} catch (Exception e) {
		}

	}

	/**
	 * =================================================================================================================
	 * 広告を閉じる
	 * =================================================================================================================
	 *
	 * @param WebDriver
	 *            driver
	 *
	 * @author kimC
	 *
	 */
	public static  void ad_close(WebDriver driver) {
		try {
			driver.findElement(By.className("delete")).click();
			// 0.8秒待ち
			Thread.sleep(800);
		} catch (Exception e) {
		}
	}

}
