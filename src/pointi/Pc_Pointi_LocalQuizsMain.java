package pointi;

import pointi.ad_areas.Pointi_LocalQuizs;

/**
 * =====================================================================================================================
 * ポイントインカム：ザ・ご当地検定
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Pointi_LocalQuizsMain {

	// ポイントインカム：ザ・ご当地検定
	public static void main(String[] args) {
		Pointi_LocalQuizs pointi_LocalQuizs = new Pointi_LocalQuizs();
		int point = pointi_LocalQuizs.execute();
		System.out.println("【ポイントインカム】：当地検定終了。獲得済みポイント：" + point);
	}
}
