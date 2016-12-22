package chance;

import chance.ad_areas.Chance_Election;

/**
 * =====================================================================================================================
 * チャンスイット：クマクマ総選挙
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Chance_ElectionMain {

	public static void main(String[] args) {
		// チャンスイット：クマクマ総選挙
		Chance_Election election = new Chance_Election();
		int point = election.execute();
		System.out.println("【チャンスイット】総選挙終了。獲得済みのポイント" + point);
	}

}
