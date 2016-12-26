package pointi;

import pointi.ad_areas.Pointi_Election;;

/**
 * =====================================================================================================================
 * ポイントインカム：クマクマ総選挙
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Pointi_ElectionMain {
	// ポイントインカム：クマクマ総選挙
	public static void main(String[] args) {
		Pointi_Election pointi_Election = new Pointi_Election();
		int point = pointi_Election.execute();
		System.out.println("【ポイントインカム】：総選挙終了。獲得済みポイント：" + point);
	}
}
