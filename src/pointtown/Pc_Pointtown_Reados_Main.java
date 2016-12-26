package pointtown;

import static common.Common.*;
import static common.constant.PointConstants.*;

import pointtown.ad_areas.Pointtown_Reados;

/**
 * =====================================================================================================================
 * 【ポイントタウン】：クマクマ調査団
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Pointtown_Reados_Main {
	// 【ポイントタウン】：クマクマ調査団
	public static void main(String[] args) {
		Pointtown_Reados reados = new Pointtown_Reados();
		int point = reados.execute();
		System.out.println(get_end_message(HAPITAS, MORIMORI_QUIZ, point));
	}
}
