package chance;

import chance.quiz.Chance_Toidas;

/**
 * =====================================================================================================================
 * チャンスイット：トイダス
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Chance_ToidasMain {

	public static void main(String[] args) {
		// チャンスイット：トイダス
		Chance_Toidas toidas = new Chance_Toidas();
		int point = toidas.execute();
		System.out.println("【チャンスイット】トイダス終了。獲得済みポイント:" + point);

	}

}
