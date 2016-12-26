package gendama;

import static common.Common.*;
import static common.constant.PointConstants.*;

import gendama.ad_areas.Gendama_LocalQuizs;

/**
 * =====================================================================================================================
 * ポイントインカム：ザ・ご当地検定
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Gendama_LocalQuizs_Main {
	// げん玉：ザ・ご当地検定
	public static void main(String[] args) {
		Gendama_LocalQuizs localQuizs = new Gendama_LocalQuizs();
		int point = localQuizs.execute();
		System.out.println(get_end_message(GENDAMA, LOCAL_QUIZS, point));
	}

}
