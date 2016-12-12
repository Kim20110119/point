package gendama;

import gendama.ad_areas.Gendama_Reados;

public class ReadosMain {

	/**
	 * =====================================================================================================================
	 * げん玉：クマクマ調査団
	 * =====================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public static void main(String[] args) {
		Gendama_Reados reados = new Gendama_Reados();
		int point = reados.execute();
		System.out.println("調査団終了。獲得済みのポイント" + point);

	}

}
