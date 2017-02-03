package gendama;

import static common.Common.*;
import static common.constant.PointConstants.*;

import gendama.sp.Sp_Gendama_Election;

/**
 * =====================================================================================================================
 * 【げん玉】：クマクマ総選挙
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Sp_Gendama_Election_Main {
	// 【げん玉】：クマクマ総選挙
	public static void main(String[] args) {
		Sp_Gendama_Election forest = new Sp_Gendama_Election();
		int point = forest.execute();
		System.out.println(get_end_message(GENDAMA, ELECTION, point));
	}

}
