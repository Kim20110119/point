package chobirich;

import chobirich.ad_areas.Chobirich_Enquete;

/**
 * =====================================================================================================================
 * 【ちょびリッチ】：クマクマ総選挙
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Chobirich_Manga_Enquete_Main {
	// ちょびリッチ：クマクマ総選挙
	public static void main(String[] args) {
		Chobirich_Enquete enquete = new Chobirich_Enquete();
		int point = enquete.execute();
		System.out.println("【ちょびリッチ】漫画アンケート終了。獲得済みポイント"+point);
	}

}
