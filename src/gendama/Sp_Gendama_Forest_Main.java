package gendama;

import static common.Common.*;
import static common.constant.PointConstants.*;

import gendama.sp.Sp_Gendama_Forest;

/**
 * =====================================================================================================================
 * 【げん玉】：ポイントの森
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Sp_Gendama_Forest_Main {
	// 【げん玉】：ポイントの森
	public static void main(String[] args) {
		Sp_Gendama_Forest forest = new Sp_Gendama_Forest();
		forest.execute();
		System.out.println(get_end_message(GENDAMA, FOREST, 20));
	}

}
