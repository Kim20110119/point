package gendama;

import static common.Common.*;
import static common.constant.PointConstants.*;

import gendama.ad_areas.Gendama_Enquete;

/**
 * =====================================================================================================================
 * 【げん玉】：漫画アンケート
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Gendama_Manga_Enquete_Main {
	// 【げん玉】：漫画アンケート
	public static void main(String[] args) {
		Gendama_Enquete enquete = new Gendama_Enquete();
		int point = enquete.execute();
		System.out.println(get_end_message(GENDAMA, MANGA_ENQUETE, point));
	}

}
