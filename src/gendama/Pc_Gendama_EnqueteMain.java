package gendama;

import gendama.ad_areas.Gendama_Enquete;

public class Pc_Gendama_EnqueteMain {

	public static void main(String[] args) {
		// げん玉：クマクマ総選挙
		Gendama_Enquete enquete = new Gendama_Enquete();
		int point = enquete.execute();
		System.out.println("漫画アンケート終了。獲得済みポイント"+point);
	}

}
