package gendama;

import static common.Common.*;
import static common.constant.PointConstants.*;

import gendama.home.Gendama_Forest;

/**
 * =====================================================================================================================
 * 【げん玉】：ポイントの森
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Gendama_Forest_Main {
	// 【げん玉】：ポイントの森
	public static void main(String[] args) {
		Gendama_Forest forest = new Gendama_Forest();
		forest.execute();
		System.out.println(get_end_message(GENDAMA, FOREST, 40));
	}
}
