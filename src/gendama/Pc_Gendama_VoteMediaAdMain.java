package gendama;

import gendama.mrga.Gendama_VoteMediaAd;

public class Pc_Gendama_VoteMediaAdMain {

	public static void main(String[] args) {
		// げん玉：モリモリ多数決
		Gendama_VoteMediaAd voteMediaAd = new Gendama_VoteMediaAd();
		int point = voteMediaAd.execute();
		System.out.println("モリモリモリモリ多数決終了。獲得済みのポイント" + point);
	}

}
