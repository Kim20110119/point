package pointtown;

import static common.Common.*;
import static common.constant.PointConstants.*;

import pointtown.ad_areas.Pointtown_Enquete;

/**
 * =====================================================================================================================
 * 【ポイントタウン】：漫画アンケート
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Pointtown_Manga_Enquete_Main {
	// 【ポイントタウン】：漫画アンケート
	public static void main(String[] args) {
		Pointtown_Enquete enquete = new Pointtown_Enquete();
		int point = enquete.execute();
		System.out.println(get_end_message(HAPITAS, MANGA_ENQUETE, point));
	}

}
