package dietnavi;

import dietnavi.quiz.Dietnavi_Toidas;

/**
 * =====================================================================================================================
 * GetMoney：トイダス
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Dietnavi_ToidasMain {

	public static void main(String[] args) {
		// GetMoney：トイダス
		Dietnavi_Toidas toidas = new Dietnavi_Toidas();
		int point = toidas.execute();
		System.out.println("【GetMoney】トイダス終了。獲得済みポイント:" + point);

	}

}
