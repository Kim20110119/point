package gendama;

import static common.Common.*;
import static common.constant.PointConstants.*;

import gendama.shindan.Gendama_Shindan;

/**
 * =====================================================================================================================
 * 【げん玉】：WEB診断
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Gendama_WebShidan_Main {
	// 【げん玉】：WEB診断
	public static void main(String[] args) {
		Gendama_Shindan shindan= new Gendama_Shindan();
		int point = shindan.execute();
		System.out.println(get_end_message(GENDAMA, WEB_SHINDAN, point));

	}

}
