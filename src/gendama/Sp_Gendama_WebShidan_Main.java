package gendama;

import static common.Common.*;
import static common.constant.PointConstants.*;

import gendama.sp.Sp_Gendama_Shindan;

/**
 * =====================================================================================================================
 * 【げん玉】：WEB診断
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Sp_Gendama_WebShidan_Main {
	// 【げん玉】：WEB診断
	public static void main(String[] args) {
		Sp_Gendama_Shindan shindan= new Sp_Gendama_Shindan();
		int point  = shindan.execute();
		System.out.println(get_end_message(GENDAMA, WEB_SHINDAN, point));
	}
}
