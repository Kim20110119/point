package gendama;

import static common.Common.*;
import static common.constant.PointConstants.*;

import gendama.ad_areas.Gendama_Election;

/**
 * =====================================================================================================================
 * 【げん玉】：クマクマ総選挙
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Gendama_Election_Main {
	// 【げん玉】：クマクマ総選挙
	public static void main(String[] args) {
		Gendama_Election forest = new Gendama_Election();
		int point = forest.execute();
		System.out.println(get_end_message(GENDAMA, ELECTION, point));
	}

}
