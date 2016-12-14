package gendama;

import gendama.ad_areas.Gendama_Election;

public class Pc_Gendama_ElectionMain {

	public static void main(String[] args) {
		// げん玉：クマクマ総選挙
		Gendama_Election forest = new Gendama_Election();
		int point = forest.execute();
		System.out.println("総選挙終了。獲得済みのポイント" + point);
	}

}
