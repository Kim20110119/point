package gendama.home;

import static common.constant.PointConstants.*;

import gendama.Pc_Gendama;


/**
 * =====================================================================================================================
 * げん玉：ポイントの森
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Gendama_Forest extends Pc_Gendama  {

	public Gendama_Forest() {
		// げん玉：ポイントの森
		driver.get(GENDAMA_FOREST_URL);
	}

	// =================================================================================================================
	// ポイントの森
	// =================================================================================================================
	public void execute() {

		try {
			// １秒待ち
			Thread.sleep(1000);
			// 「詳しく見て1pt」
			int count_1 = getSize(getByXpath("img", "src", "http://img.gendama.jp/img/forest/forest_bt1.gif"));
			for (int i = 1; i < count_1; i++) {
				clickByIndex(getByXpath("img", "src", "http://img.gendama.jp/img/forest/forest_bt1.gif"),i);
			}
			System.out.println(count_1 + "ポイント獲得");
			// 「毎日必ず1pt」
			int count_2 = getSize(getByXpath("img", "src", "//img.gendama.jp/img/neo/index/click_pt.png"));
			for (int i = 1; i < count_2; i++) {
				clickByIndex(getByXpath("img", "src", "//img.gendama.jp/img/neo/index/click_pt.png"),i);
			}
			System.out.println(count_2 + "ポイント獲得");
			// 「詳しく見て1pt」;
			int count_3 = getSize(getByXpath("img", "src", "http://img.gendama.jp/img/forest/bt_day1.gif"));
			for (int i = 1; i < count_3; i++) {
				clickByIndex(getByXpath("img", "src", "http://img.gendama.jp/img/forest/bt_day1.gif"),i);
			}
			System.out.println(count_3 + "ポイント獲得");
			// 「毎日必ず1pt」
			int count_4 = getSize(getByXpath("dd", "class", "detail"));
			for (int i = 1; i < count_4; i++) {
				clickByIndex(getByXpath("dd", "class", "detail"),i);
			}
			System.out.println(count_4 + "ポイント獲得");
			// 「5pt」
			click(getByXpath("img", "src", "//img.gendama.jp/img/forest/star.gif"));
			int point_count = count_1 + count_2 + count_3 + count_4 + 5;
			System.out.println(point_count + "ポイント獲得");
			Thread.sleep(1000);
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			driver.quit();
		}

	}

}
