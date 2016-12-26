package nyandaful;

import nyandaful.ad_areas.Nyandaful_Reados;

public class Pc_Nyandaful_ReadosMain {

	/**
	 * =====================================================================================================================
	 * にゃんダフル：クマクマ調査団
	 * =====================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public static void main(String[] args) {
		Nyandaful_Reados reados = new Nyandaful_Reados();
		int point = reados.execute();
		System.out.println("【にゃんダフル】調査団終了。獲得済みのポイント" + point);

	}

}
