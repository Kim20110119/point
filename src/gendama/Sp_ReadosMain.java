package gendama;

import gendama.sp.Sp_Gendama_Reados;

public class Sp_ReadosMain {

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
		System.out.println("調査団終了。獲得済みのポイント" + point);

	}

}
