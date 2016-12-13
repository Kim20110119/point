package gendama;

import gendama.sp.Sp_Gendama_Election;

public class Sp_ElectionMain {

	public static void main(String[] args) {
		// げん玉：クマクマ総選挙
		Sp_Gendama_Election forest = new Sp_Gendama_Election();
		forest.execute();
		System.out.println("総選挙終了");
	}

}
