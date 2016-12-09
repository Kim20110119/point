package gendama;

import gendama.ad_areas.Gendama_Election;

public class ElectionMain {

	public static void main(String[] args) {
		// げん玉：クマクマ総選挙
		Gendama_Election forest = new Gendama_Election();
		forest.execute();
		System.out.println("総選挙終了");
	}

}
