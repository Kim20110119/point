package pointi;

import pointi.ad_areas.Reados;

public class Pointi {

	public static void main(String[] args) {
		for(int i = 1; i <= 30; i++){
			// 「クマクマ調査団」ポイント
			Reados reados = new Reados();
			int reados_point = reados.execute();
			System.out.println(reados_point);
		}


	}

}
