package gendama;

import static common.Common.*;
import static common.constant.PointConstants.*;

import gendama.sp.Sp_Gendama_Enquete;

/**
 * =====================================================================================================================
 * 【げん玉】：アンケート（携帯）
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Sp_Gendama_Enquete_Main {
	// 【げん玉】：アンケート（携帯）
	public static void main(String[] args) {
		int point = 0;
		for(int i = 0; i < 10; i++){
			Sp_Gendama_Enquete enquete = new Sp_Gendama_Enquete();
			point += enquete.execute();
		}
		System.out.println(get_end_message(GENDAMA, "アンケート（携帯）", point));
	}

}
