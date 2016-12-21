package chobirich;

import chobirich.ad_areas.Chobirich_Enquete;

public class Pc_Chobirich_EnqueteMain {

	public static void main(String[] args) {
		// ちょびリッチ：クマクマ総選挙
		Chobirich_Enquete enquete = new Chobirich_Enquete();
		int point = enquete.execute();
		System.out.println("【ちょびリッチ】漫画アンケート終了。獲得済みポイント"+point);
	}

}
