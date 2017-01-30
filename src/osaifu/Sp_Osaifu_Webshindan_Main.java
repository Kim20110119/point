package osaifu;

import osaifu.sp.Sp_Osaifu_Shindan;

/**
 * =====================================================================================================================
 * 【お財布】：WEB診断
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Sp_Osaifu_Webshindan_Main {
	// 【お財布】：WEB診断
	public static void main(String[] args) {
		Sp_Osaifu_Shindan shindan = new Sp_Osaifu_Shindan();
		int reados_point = shindan.execute();
		System.out.println(reados_point);
	}

}