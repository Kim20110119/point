package chance;

import chance.register.Chance_Register;

/**
 * =====================================================================================================================
 * チャンスイット：登録
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Chance_Register {

	public static void main(String[] args) {
		// チャンスイット：WEB診断
		Chance_Register register= new Chance_Register();
		int point = register.execute();
		System.out.println("【チャンスイット】WEB診断終了。獲得済みポイント：" + point);

	}

}
