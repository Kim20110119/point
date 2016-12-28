package moppy;

import static common.Common.*;
import static common.constant.PointConstants.*;

import moppy.ad_areas.Moppy_Reados;

/**
 * =====================================================================================================================
 * 【モッピー】：クマクマ調査団
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Moppy_Reados_Main {
	// 【モッピー】：クマクマ調査団
	public static void main(String[] args) {
		Moppy_Reados reados = new Moppy_Reados();
		int point = reados.execute();
		System.out.println(get_end_message(GENDAMA, MORIMORI_QUIZ, point));
	}
}
