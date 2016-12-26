package gendama;

import static common.Common.*;
import static common.constant.PointConstants.*;

import gendama.sp.Sp_Gendama_Reados;

public class Sp_Reados_Main {

	/**
	 * =====================================================================================================================
	 * げん玉(携帯)：クマクマ調査団
	 * =====================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public static void main(String[] args) {
		Sp_Gendama_Reados reados = new Sp_Gendama_Reados();
		int point = reados.execute();
		System.out.println(get_end_message(GENDAMA, MORIMORI_QUIZ, point));
	}

}
