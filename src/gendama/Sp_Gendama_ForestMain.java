package gendama;

import gendama.sp.Sp_Gendama_Forest;

/**
 * =====================================================================================================================
 * げん玉：ポイントの森
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Sp_Gendama_ForestMain {

	// ポイントの森メイン処理
	public static void main(String[] args) {
		Sp_Gendama_Forest forest = new Sp_Gendama_Forest();
		forest.execute();
		System.out.println("【携帯】：ポイントの森終了");
	}

}
