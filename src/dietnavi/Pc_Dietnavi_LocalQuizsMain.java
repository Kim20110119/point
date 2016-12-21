package dietnavi;

import dietnavi.ad_areas.Dietnavi_LocalQuizs;

/**
 * =====================================================================================================================
 * GetMoney：ザ・ご当地検定
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Dietnavi_LocalQuizsMain {

	public static void main(String[] args) {
		// GetMoney：ザ・ご当地検定
		Dietnavi_LocalQuizs localQuizs = new Dietnavi_LocalQuizs();
		localQuizs.execute();
		System.out.println("【GetMoney】当地検定終了。獲得済みポイント:10");

	}

}
