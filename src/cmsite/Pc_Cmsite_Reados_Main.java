package cmsite;

import static common.Common.*;
import static common.constant.PointConstants.*;

import cmsite.ad_areas.Cmsite_Reados;

/**
 * =====================================================================================================================
 * 【CMサイト】：クマクマ調査団
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Cmsite_Reados_Main {
	// 【CMサイト】：クマクマ調査団
	public static void main(String[] args) {
		Cmsite_Reados reados = new Cmsite_Reados();
		int point = reados.execute();
		System.out.println(get_end_message(CMSITE, MORIMORI_QUIZ, point));
	}
}
