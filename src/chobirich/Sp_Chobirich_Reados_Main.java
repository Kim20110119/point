package chobirich;

import chobirich.sp.Sp_Chobirich_Reados;

/**
 * =====================================================================================================================
 * ちょびリッチ：クマクマ調査団
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Sp_Chobirich_Reados_Main {
	// ちょびリッチ：クマクマ調査団
	public static void main(String[] args) {
		Sp_Chobirich_Reados reados = new Sp_Chobirich_Reados();
		int point = reados.execute();
		System.out.println("【ちょびリッチ】調査団終了。獲得済みのポイント" + point);

	}

}
