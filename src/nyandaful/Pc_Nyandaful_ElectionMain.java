package nyandaful;

import nyandaful.ad_areas.Nyandaful_Election;

public class Pc_Nyandaful_ElectionMain {

	public static void main(String[] args) {
		// にゃんダフル：クマクマ総選挙
		Nyandaful_Election forest = new Nyandaful_Election();
		int point = forest.execute();
		System.out.println("【にゃんダフル】総選挙終了。獲得済みのポイント" + point);
	}

}
