package pointi;

import pointi.enquete.Pointi_WebInterview;

public class PointiMain {

	public static void main(String[] args) {
		// 「クマクマ調査団」ポイント
		Pointi_WebInterview election = new Pointi_WebInterview();
		int reados_point = election.execute();
		System.out.println(reados_point);
	}

}