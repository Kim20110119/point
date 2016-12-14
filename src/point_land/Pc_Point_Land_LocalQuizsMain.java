package point_land;

import point_land.ad_areas.Point_Land_LocalQuizs;

/**
 * =====================================================================================================================
 * ポイントインカム：ザ・ご当地検定
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Point_Land_LocalQuizsMain {

	public static void main(String[] args) {
		// ポイントランド：ザ・ご当地検定
		Point_Land_LocalQuizs localQuizs = new Point_Land_LocalQuizs();
		localQuizs.execute();
		System.out.println("ポイントランド当地検定終了。獲得済みポイント:10");

	}

}
