package realworld;

import gendama.ad_areas.Gendama_Election;
import gendama.ad_areas.Gendama_LocalQuizs;
import gendama.ad_areas.Gendama_Reados;

public class RealworldMain {

	public static void main(String[] args) {
		// げん玉：クマクマ総選挙
		Gendama_Election forest = new Gendama_Election();
		forest.execute();
		System.out.println("総選挙終了");
		// げん玉：ザ・ご当地検定
		Gendama_LocalQuizs localQuizs = new Gendama_LocalQuizs();
		localQuizs.execute();
		System.out.println("当地検定終了");
		// げん玉：クマクマ調査団
		Gendama_Reados reados = new Gendama_Reados();
		reados.execute();
		System.out.println("調査団");

	}

}
