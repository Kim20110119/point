package cmsite;

import static common.Common.*;
import static common.constant.PointConstants.*;

import cmsite.ad_areas.Cmsite_LocalQuizs;

/**
 * =====================================================================================================================
 * CMサイト：ザ・ご当地検定
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Cmsite_LocalQuizs_Main {
	// CMサイト：ザ・ご当地検定
	public static void main(String[] args) {
		Cmsite_LocalQuizs localQuizs = new Cmsite_LocalQuizs();
		int point = localQuizs.execute();
		System.out.println(get_end_message(CMSITE, LOCAL_QUIZS, point));
	}

}
