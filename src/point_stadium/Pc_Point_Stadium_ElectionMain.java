package point_stadium;

import point_stadium.ad_aress.Point_Stadium_Election;

public class Pc_Point_Stadium_ElectionMain {

	public static void main(String[] args) {
		// ポイントスタジアム：クマクマ総選挙
		Point_Stadium_Election forest = new Point_Stadium_Election();
		int point = forest.execute();
		System.out.println("【ポイントスタジアム】総選挙終了。獲得済みのポイント" + point);
	}

}
