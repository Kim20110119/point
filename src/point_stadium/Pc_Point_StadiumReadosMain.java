package point_stadium;

import point_stadium.ad_aress.Point_Stadium_Reados;

public class Pc_Point_StadiumReadosMain {

	/**
	 * =====================================================================================================================
	 * ポイントスタジアム：クマクマ調査団
	 * =====================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public static void main(String[] args) {
		Point_Stadium_Reados reados = new Point_Stadium_Reados();
		int point = reados.execute();
		System.out.println("【ポイントスタジアム】調査団終了。獲得済みのポイント" + point);

	}

}
