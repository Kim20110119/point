package pointi;

import pointi.game.Pointi_Prices;

/**
 * =====================================================================================================================
 * ポイントインカム：プライス調査隊
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Pointi_RricesMain {

	public static void main(String[] args) {
		for(int i = 0; i< 50;i++){
			// ポイントインカム：プライス調査隊
			Pointi_Prices pointi_Prices = new Pointi_Prices();
			int point = pointi_Prices.execute();
			System.out.println("【ポイントインカム】：プライス調査隊終了。獲得済みポイント：" + point);
		}
	}

}