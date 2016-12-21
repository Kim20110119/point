package pointi;

import pointi.game.Pointi_Prices;

public class Pc_Pointi_RricesMain {

	public static void main(String[] args) {
		for(int i = 0; i< 50;i++){
			// ポイントインカム：クマクマ調査団
			Pointi_Prices pointi_Prices = new Pointi_Prices();
			pointi_Prices.execute();
			System.out.println("調査団終了");
		}


	}

}