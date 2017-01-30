package osaifu;

import static common.Common.*;
import static common.constant.PointConstants.*;

import osaifu.sp.Sp_Osaifu_Reados;

/**
 * =====================================================================================================================
 * 【お財布】：クマクマ調査団（携帯）
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Sp_Osaifu_Reados_Main {
	// 【お財布】：クマクマ調査団
	public static void main(String[] args) {
		Sp_Osaifu_Reados reados = new Sp_Osaifu_Reados();
		int point = reados.execute();
		System.out.println(get_end_message(GENDAMA, MORIMORI_QUIZ, point));
	}
}
