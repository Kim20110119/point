package gendama;

import gendama.ad_areas.Gendama_LocalQuizs;

/**
 * =====================================================================================================================
 * ポイントインカム：ザ・ご当地検定
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Gendama_LocalQuizsMain {

	public static void main(String[] args) {
		// げん玉：ザ・ご当地検定
		Gendama_LocalQuizs localQuizs = new Gendama_LocalQuizs();
		localQuizs.execute();
		System.out.println("当地検定終了。獲得済みポイント:10");

	}

}
