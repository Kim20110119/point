package gendama.click;

import static common.constant.PointConstants.*;

import org.openqa.selenium.By;

import gendama.Gendama;

public class Test extends Gendama {

	public Test() {
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
			int count_1 = driver.findElements(By.xpath("//img[@src='http://img.gendama.jp/img/forest/forest_bt1.gif']"))
					.size();
			for (int index_1 = 1; index_1 < count_1; index_1++) {
				driver.findElements(By.xpath("//img[@src='http://img.gendama.jp/img/forest/forest_bt1.gif']"))
						.get(index_1).click();
			}
			System.out.println(count_1 + "ポイント獲得");
			// 「毎日必ず1pt」
			int count_2 = driver.findElements(By.xpath("//img[@src='//img.gendama.jp/img/neo/index/click_pt.png']"))
					.size();
			for (int index_2 = 1; index_2 < count_2; index_2++) {
				driver.findElements(By.xpath("//img[@src='//img.gendama.jp/img/neo/index/click_pt.png']")).get(index_2)
						.click();
			}
			System.out.println(count_2 + "ポイント獲得");
			// 「詳しく見て1pt」
			int count_3 = driver.findElements(By.xpath("//img[@src='http://img.gendama.jp/img/forest/bt_day1.gif']"))
					.size();
			for (int index_3 = 1; index_3 < count_3; index_3++) {
				driver.findElements(By.xpath("//img[@src='http://img.gendama.jp/img/forest/bt_day1.gif']")).get(index_3)
						.click();
			}
			System.out.println(count_3 + "ポイント獲得");
			// 「毎日必ず1pt」
			int count_4 = driver.findElements(By.xpath("//dd[@class='detail']")).size();
			for (int index_4 = 1; index_4 < count_4; index_4++) {
				driver.findElements(By.xpath("//dd[@class='detail']")).get(index_4).click();
			}
			System.out.println(count_4 + "ポイント獲得");
			// 「5pt」
			driver.findElement(By.xpath("//img[@src='//img.gendama.jp/img/forest/star.gif']")).click();
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
