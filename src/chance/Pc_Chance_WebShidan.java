package chance;

import chance.shindan.Chance_Shindan;

/**
 * =====================================================================================================================
 * チャンスイット：WEB診断
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Chance_WebShidan {

	public static void main(String[] args) {
		// チャンスイット：WEB診断
		Chance_Shindan shindan= new Chance_Shindan();
		int point = shindan.execute();
		System.out.println("【チャンスイット】WEB診断終了。獲得済みポイント：" + point);

	}

}
