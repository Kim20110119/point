package point_land;

import point_land.ad_areas.Point_Land_Enquete_Shindan;

public class Pc_Point_Land_Enquete_ShindanMain {

	public static void main(String[] args) {
		// ポイントランド：アンケート&診断
		Point_Land_Enquete_Shindan enquete = new Point_Land_Enquete_Shindan();
		int point = enquete.execute();
		System.out.println("ポイントランドアンケート&診断終了。獲得済みポイント"+point);
	}

}
