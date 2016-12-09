package pointi;

import pointi.ad_areas.Pointi_LocalQuizs;

public class UnitPointi {

	public static void main(String[] args) {
		// 「クマクマ調査団」ポイント
		Pointi_LocalQuizs reados = new Pointi_LocalQuizs();
		int reados_point = reados.execute();
		System.out.println("クマクマ調査団により獲得済みポイント：" + reados_point + "Pt");

	}

}