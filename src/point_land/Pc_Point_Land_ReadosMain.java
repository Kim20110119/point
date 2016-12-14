package point_land;

import point_land.ad_areas.Point_Land_Reados;

public class Pc_Point_Land_ReadosMain {

	/**
	 * =====================================================================================================================
	 * ポイントランド：クマクマ調査団
	 * =====================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public static void main(String[] args) {
		Point_Land_Reados reados = new Point_Land_Reados();
		int point = reados.execute();
		System.out.println("ポイントランド調査団終了。獲得済みのポイント" + point);

	}

}
