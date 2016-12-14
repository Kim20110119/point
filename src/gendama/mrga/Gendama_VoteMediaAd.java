package gendama.mrga;

import static common.constant.PointConstants.*;

import java.util.Random;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import gendama.Pc_Gendama;

/**
 * =====================================================================================================================
 * げん玉：みんなで多数決
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Gendama_VoteMediaAd extends Pc_Gendama {

	/** 「獲得ポイント」 */
	int point_count = 0;

	/**
	 * コンストラクタ
	 */
	public Gendama_VoteMediaAd() {
		// げん玉：モリゲー
		driver.get(GENDAMA_AD_ENQ_LIST_URL);
	}

	/**
	 * =================================================================================================================
	 * モリモリアみんなで多数決
	 * =================================================================================================================
	 *
	 * @return int point_couont 獲得済みポイント
	 *
	 * @author kimC
	 *
	 */
	public Integer execute() {
		// げん玉：みんなで多数決URL
		String morimori_link = driver.findElement(By.className("enqueteBox")).findElements(By.tagName("a")).get(0)
				.getAttribute("href");
		// 「げん玉」みんなで多数決画面
		driver.get(morimori_link);
		start();
		return point_count;

	}

	/**
	 * =================================================================================================================
	 * モリモリみんなで多数決スタート
	 * =================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public void start() {
		try {
			// １秒待ち
			Thread.sleep(1000);
			// 「さっそくスタート」
			driver.findElement(By.className("start__button")).click();
			String end_message = getEndMessage();
			// 本日の終了を判断する
			if (end_message.matches(GENDAMA_END_MESSAGE)) {
				System.out.println(end_message);
				// ドライバー終了
				driver.quit();
			}
			// １秒待ち
			Thread.sleep(500);
			for (int index = 1; index < 500; index++) {
				// 「ラジオボタン」
				int radio_count = driver.findElements(By.name("choice_id")).size();
				if (radio_count > 0) {
					// Randomクラスのインスタンス化
					Random rnd = new Random();
					int answer = rnd.nextInt(radio_count);
					// 選択肢を選択する
					driver.findElements(By.xpath("//label[@class='radio']")).get(answer).click();
					// 「投票する」
					driver.findElement(By.xpath("//input[@value='投票する']")).click();
					// 0.5秒待ち
					Thread.sleep(3000);
					// 「次の質問へ」
					driver.findElement(By.className("button--next")).click();
				}
				point_count += 10;
			}
			// ドライバー終了
			driver.quit();
		} catch (Exception e) {
			System.out.println("【エラー】：モリモリみんなで多数決失敗");
			point_count -= 10;
			// ドライバー終了
			driver.quit();
		}
	}

	/**
	 * =================================================================================================================
	 * 終了メッセージを取得する
	 * =================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public String getEndMessage() {
		String end_message = StringUtils.EMPTY;
		try {
			end_message = driver.findElement(By.className("next__none")).getText();
			return end_message;
		} catch (Exception e) {
			return end_message;
		}
	}

}
