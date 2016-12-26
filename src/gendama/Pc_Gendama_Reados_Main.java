package gendama;

import static common.Common.*;
import static common.constant.PointConstants.*;

import gendama.ad_areas.Gendama_Reados;

/**
 * =====================================================================================================================
 * 【げん玉】：クマクマ調査団
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Gendama_Reados_Main {
	// 【げん玉】：クマクマ調査団
	public static void main(String[] args) {
		Gendama_Reados reados = new Gendama_Reados();
		int point = reados.execute();
		System.out.println(get_end_message(GENDAMA, MORIMORI_QUIZ, point));
	}
}
