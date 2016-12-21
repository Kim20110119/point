package osaifu;

import moppy.shindan.Moppy_Shindan;

/**
 * =====================================================================================================================
 * げん玉：WEB診断
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Moppy_Webshindan_Main {

	public static void main(String[] args) {
		Moppy_Shindan moppy_Shindan = new Moppy_Shindan();
		int reados_point = moppy_Shindan.execute();
		System.out.println(reados_point);
	}

}