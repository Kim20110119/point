package osaifu;

import osaifu.shindan.Osaifu_Shindan;

/**
 * =====================================================================================================================
 * 【お財布】：WEB診断
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Osaifu_Webshindan_Main {
	// 【お財布】：WEB診断
	public static void main(String[] args) {
		Osaifu_Shindan shindan = new Osaifu_Shindan();
		int reados_point = shindan.execute();
		System.out.println(reados_point);
	}

}