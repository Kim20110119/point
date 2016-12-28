package osaifu;

import static common.Common.*;
import static common.constant.PointConstants.*;

import osaifu.ad_areas.Osaifu_Reados;

/**
 * =====================================================================================================================
 * 【お財布】：クマクマ調査団
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Osaifu_Reados_Main {
	// 【お財布】：クマクマ調査団
	public static void main(String[] args) {
		Osaifu_Reados reados = new Osaifu_Reados();
		int point = reados.execute();
		System.out.println(get_end_message(GENDAMA, MORIMORI_QUIZ, point));
	}
}
