package point_land;

import point_land.enquete.Point_Land_Enquete;

public class Pc_Point_Land_Enquete {

	public static void main(String[] args) {
		// ポイントランド：アンケート
		Point_Land_Enquete enquete = new Point_Land_Enquete();
		int point = enquete.execute();
		System.out.println("ポイントランドアンケート&診断終了。獲得済みポイント"+point);
	}

}
