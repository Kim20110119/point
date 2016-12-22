package chance;

import chance.enquete.Chance_Enquete;

/**
 * =====================================================================================================================
 * チャンスイット：アンケート
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Chance_EnqueteMain {

	public static void main(String[] args) {
		// チャンスイット：アンケート
		Chance_Enquete enquete = new Chance_Enquete();
		int point = enquete.execute();
		System.out.println("【チャンスイット】アンケート終了。獲得済みのポイント" + point);
	}

}
