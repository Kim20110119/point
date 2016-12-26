package chobirich;

import chobirich.enquete.Chobirich_Enquete;

/**
 * =====================================================================================================================
 * ちょびリッチ：アンケート
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Chobirich_Enquete_Main {
	// ちょびリッチ：アンケート
	public static void main(String[] args) {
		Chobirich_Enquete enquete = new Chobirich_Enquete();
		int point = enquete.execute();
		System.out.println("【ちょびリッチ】アンケート終了。獲得済みポイント"+point);
	}
}