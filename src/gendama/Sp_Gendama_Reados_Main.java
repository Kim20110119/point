package gendama;

import static common.Common.*;
import static common.constant.PointConstants.*;

import gendama.sp.Sp_Gendama_Reados;

/**
 * =====================================================================================================================
 * 【げん玉】：クマクマ調査団（携帯版）
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Sp_Gendama_Reados_Main {
	// 【げん玉】：クマクマ調査団（携帯版）
	public static void main(String[] args) {
		Sp_Gendama_Reados reados = new Sp_Gendama_Reados();
		reados.execute();
		System.out.println(get_end_message(GENDAMA, FOREST, 20));
	}

}
