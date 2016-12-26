package hapitas;

import static common.Common.*;
import static common.constant.PointConstants.*;

import hapitas.ad_areas.Hapitas_Enquete;

/**
 * =====================================================================================================================
 * 【ハピタス】：漫画アンケート
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Hapitas_Manga_Enquete_Main {
	// 【ハピタス】：漫画アンケート
	public static void main(String[] args) {
		Hapitas_Enquete enquete = new Hapitas_Enquete();
		int point = enquete.execute();
		System.out.println(get_end_message(HAPITAS, MANGA_ENQUETE, point));
	}

}
