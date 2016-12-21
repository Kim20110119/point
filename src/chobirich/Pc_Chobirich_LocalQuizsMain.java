package chobirich;

import chobirich.ad_areas.Chobirich_LocalQuizs;

/**
 * =====================================================================================================================
 * ちょびリッチ：ザ・ご当地検定
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Chobirich_LocalQuizsMain {

	public static void main(String[] args) {
		// ちょびリッチ：ザ・ご当地検定
		Chobirich_LocalQuizs localQuizs = new Chobirich_LocalQuizs();
		localQuizs.execute();
		System.out.println("【ちょびリッチ】当地検定終了。獲得済みポイント:10");

	}

}
