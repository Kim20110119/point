package osaifu;

import static common.Common.*;
import static common.constant.PointConstants.*;

import osaifu.ad_areas.Osaifu_Ad_Enquete;

/**
 * =====================================================================================================================
 * 【お財布】：漫画アンケート
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Osaifu_Ad_EnqueteMain {
	// 【お財布】：漫画アンケート
	public static void main(String[] args) {
		Osaifu_Ad_Enquete enquete = new Osaifu_Ad_Enquete();
		int point = enquete.execute();
		System.out.println(get_end_message(OSAIFU, MANGA_ENQUETE, point));
	}

}