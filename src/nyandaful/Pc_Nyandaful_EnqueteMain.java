package nyandaful;


import nyandaful.ad_areas.Nyandaful_Enquete;

public class Pc_Nyandaful_EnqueteMain {

	public static void main(String[] args) {
		// にゃんダフル：クマクマ総選挙
		Nyandaful_Enquete enquete = new Nyandaful_Enquete();
		int point = enquete.execute();
		System.out.println("【にゃんダフル】漫画アンケート終了。獲得済みポイント"+point);
	}

}
