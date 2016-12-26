package gendama.sp;

import static common.constant.GendamaConstants.*;

import org.openqa.selenium.By;

import gendama.Sp_Gendama;


/**
 * =====================================================================================================================
 * げん玉：ポイントの森(携帯)
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Sp_Gendama_Forest extends Sp_Gendama  {

	/** 「taped」 */
	private static final String C_T = "taped";

	/**
	 * コンストラクタ
	 */
	public Sp_Gendama_Forest() {
		// げん玉：ポイントの森(携帯)
		driver.get(SP_FOREST_URL);
	}

	// =================================================================================================================
	// ポイントの森
	// =================================================================================================================
	public void execute() {

		try {
			// １秒待ち
			Thread.sleep(1000);
			// 「詳しく見て1pt」
			int taped_count = getSize(getByClass(C_T));
			for (int i = 0; i < taped_count; i++) {
				driver.findElements(By.className(C_T)).get(i).click();
				driver.get(SP_FOREST_URL);
			}
			Thread.sleep(1000);
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			driver.quit();
		}

	}

}
