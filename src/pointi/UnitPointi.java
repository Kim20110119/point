package pointi;

import pointi.ad_areas.Election;

public class UnitPointi {

	public static void main(String[] args) {
		for(int i = 1; i <= 30; i++){
			// 「クマクマ調査団」ポイント
			Election election = new Election();
			int election_point = election.execute();
			System.out.println(election_point);
		}


	}

}
