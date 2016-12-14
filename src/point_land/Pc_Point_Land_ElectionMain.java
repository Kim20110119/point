package point_land;

import point_land.ad_areas.Point_Land_Election;

public class Pc_Point_Land_ElectionMain {

	public static void main(String[] args) {
		// ポイントランド：クマクマ総選挙
		Point_Land_Election forest = new Point_Land_Election();
		int point = forest.execute();
		System.out.println("ポイントランド総選挙終了。獲得済みのポイント" + point);
	}

}
