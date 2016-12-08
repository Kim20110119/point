package pointi;

import pointi.ad_areas.Election;

public class PointiMain {

	public static void main(String[] args) {
		// 「クマクマ調査団」ポイント
		Election election = new Election();
		int reados_point = election.execute();
		System.out.println(reados_point);
	}

}