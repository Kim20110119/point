package chobirich;

import chobirich.ad_areas.Chobirich_Election;

public class Pc_Chobirich_ElectionMain {

	public static void main(String[] args) {
		// ちょびリッチ：クマクマ総選挙
		Chobirich_Election forest = new Chobirich_Election();
		int point = forest.execute();
		System.out.println("【ちょびリッチ】総選挙終了。獲得済みのポイント" + point);
	}

}
