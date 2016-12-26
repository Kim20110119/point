package pointi;

import pointi.ad_areas.Pointi_Reados;

/**
 * =====================================================================================================================
 * ポイントインカム：クマクマ調査団
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Pointi_ReadosMain {

	// ポイントインカム：クマクマ調査団
	public static void main(String[] args) {
		Pointi_Reados pointi_Reados = new Pointi_Reados();
		int point = pointi_Reados.execute();
		System.out.println("【ポイントインカム】：調査団終了。獲得済みポイント" + point);

	}

}
