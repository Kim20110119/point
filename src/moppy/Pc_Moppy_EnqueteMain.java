package moppy;

import moppy.ad_areas.Moppy_Enquete;

public class Pc_Moppy_EnqueteMain {

	public static void main(String[] args) {
		// モッピー：クマクマ総選挙
		Moppy_Enquete enquete = new Moppy_Enquete();
		int point = enquete.execute();
		System.out.println("漫画アンケート終了。獲得済みポイント"+point);
	}

}