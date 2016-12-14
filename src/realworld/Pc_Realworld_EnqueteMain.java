package realworld;

import realworld.ad_areas.Realworld_Enquete;

public class Pc_Realworld_EnqueteMain {

	public static void main(String[] args) {
		// げん玉：クマクマ総選挙
		Realworld_Enquete enquete = new Realworld_Enquete();
		int point = enquete.execute();
		System.out.println("リアルワールド漫画アンケート終了。獲得済みポイント"+point);
	}

}
