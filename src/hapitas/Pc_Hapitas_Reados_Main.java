package hapitas;

import static common.Common.*;
import static common.constant.PointConstants.*;

import hapitas.ad_areas.Hapitas_Reados;

/**
 * =====================================================================================================================
 * 【ハピタス】：クマクマ調査団
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Hapitas_Reados_Main {
	// 【ハピタス】：クマクマ調査団
	public static void main(String[] args) {
		Hapitas_Reados reados = new Hapitas_Reados();
		int point = reados.execute();
		System.out.println(get_end_message(HAPITAS, MORIMORI_QUIZ, point));
	}
}
