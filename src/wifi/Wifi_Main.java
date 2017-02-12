package wifi;

import wifi.restart.Wifi_Restart;;

/**
 * =====================================================================================================================
 * ポイントインカム：クマクマ総選挙
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Wifi_Main {
	// ポイントインカム：クマクマ総選挙
	public static void main(String[] args) {
		Wifi_Restart wifi = new Wifi_Restart	();
		int point = wifi.execute();
		System.out.println("【ポイントインカム】：総選挙終了。獲得済みポイント：" + point);
	}
}
