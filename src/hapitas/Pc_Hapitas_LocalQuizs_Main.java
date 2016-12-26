package hapitas;

import static common.Common.*;
import static common.constant.PointConstants.*;

import hapitas.ad_areas.Hapitas_LocalQuizs;

/**
 * =====================================================================================================================
 * 【ハピタス】：ザ・ご当地検定
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Hapitas_LocalQuizs_Main {
	// 【ハピタス】：ザ・ご当地検定
	public static void main(String[] args) {
		Hapitas_LocalQuizs localQuizs = new Hapitas_LocalQuizs();
		int point = localQuizs.execute();
		System.out.println(get_end_message(HAPITAS, LOCAL_QUIZS, point));
	}

}
