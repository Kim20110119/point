package gendama;

import gendama.sp.Sp_Gendama_Election;

public class Sp_Election_Main {

	public static void main(String[] args) {
		// げん玉：クマクマ総選挙
		Sp_Gendama_Election forest = new Sp_Gendama_Election();
		int point =forest.execute();
		System.out.println("総選挙終了。獲得済みポイント："+point);
	}

}
