package pointi;

import pointi.ad_areas.LocalQuizs;

public class UnitPointi {

	public static void main(String[] args) {
		// 「クマクマ調査団」ポイント
		LocalQuizs reados = new LocalQuizs();
		int reados_point = reados.execute();
		System.out.println("クマクマ調査団により獲得済みポイント：" + reados_point + "Pt");

	}

}