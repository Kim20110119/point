package point_land;

import point_land.ad_areas.Point_Land_Enquete;

public class Pc_Point_Land_EnqueteMain {

	public static void main(String[] args) {
		// ポイントランド：クマクマ総選挙
		Point_Land_Enquete enquete = new Point_Land_Enquete();
		int point = enquete.execute();
		System.out.println("ポイントランド漫画アンケート終了。獲得済みポイント"+point);
	}

}