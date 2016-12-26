package dietnavi;

import dietnavi.ad_areas.Dietnavi_Election;

/**
 * =====================================================================================================================
 * GetMoney：クマクマ総選挙
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Dietnavi_ElectionMain {

	public static void main(String[] args) {
		// GetMoney：クマクマ総選挙
		Dietnavi_Election forest = new Dietnavi_Election();
		int point = forest.execute();
		System.out.println("【GetMoney】クマクマ総選挙。獲得済みのポイント" + point);
	}

}
