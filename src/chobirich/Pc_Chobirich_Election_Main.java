package chobirich;

import chobirich.ad_areas.Chobirich_Election;

/**
 * =====================================================================================================================
 * 【ちょびリッチ】：クマクマ総選挙
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Chobirich_Election_Main {
	// ちょびリッチ：クマクマ総選挙
	public static void main(String[] args) {
		Chobirich_Election forest = new Chobirich_Election();
		int point = forest.execute();
		System.out.println("【ちょびリッチ】総選挙終了。獲得済みのポイント" + point);
	}

}
