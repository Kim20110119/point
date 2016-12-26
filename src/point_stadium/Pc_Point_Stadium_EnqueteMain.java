package point_stadium;

import point_stadium.ad_aress.Point_Stadium_Enquete;

public class Pc_Point_Stadium_EnqueteMain {

	public static void main(String[] args) {
		// ポイントスタジアム：クマクマ総選挙
		Point_Stadium_Enquete enquete = new Point_Stadium_Enquete();
		int point = enquete.execute();
		System.out.println("【ポイントスタジアム】漫画アンケート終了。獲得済みポイント"+point);
	}

}
