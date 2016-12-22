package moppy;

import moppy.ad_areas.Moppy_Ad_Enquete;

public class Pc_Moppy_Ad_EnqueteMain {

	public static void main(String[] args) {
		// モッピー：クマクマ総選挙
		Moppy_Ad_Enquete enquete = new Moppy_Ad_Enquete();
		int point = enquete.execute();
		System.out.println("漫画アンケート終了。獲得済みポイント"+point);
	}

}