package chobirich;

import chobirich.ad_areas.Chobirich_Reados;

public class Pc_Chobirich_ReadosMain {

	/**
	 * =====================================================================================================================
	 * ちょびリッチ：クマクマ調査団
	 * =====================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public static void main(String[] args) {
		Chobirich_Reados reados = new Chobirich_Reados();
		int point = reados.execute();
		System.out.println("【ちょびリッチ】調査団終了。獲得済みのポイント" + point);

	}

}
