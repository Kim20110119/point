package pointtown;

import static common.Common.*;
import static common.constant.PointConstants.*;

import pointtown.ad_areas.Pointtown_LocalQuizs;

/**
 * =====================================================================================================================
 * 【ポイントタウン】：ザ・ご当地検定
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Pointtown_LocalQuizs_Main {
	// 【ポイントタウン】：ザ・ご当地検定
	public static void main(String[] args) {
		Pointtown_LocalQuizs localQuizs = new Pointtown_LocalQuizs();
		int point = localQuizs.execute();
		System.out.println(get_end_message(HAPITAS, LOCAL_QUIZS, point));
	}

}
