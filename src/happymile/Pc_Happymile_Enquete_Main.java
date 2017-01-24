package happymile;

import static common.Common.*;
import static common.constant.PointConstants.*;

import happymile.ad_areas.Happymile_Enquete;

/**
 * =====================================================================================================================
 * 【ハッピーマイル】：クマクマ調査団
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Happymile_Enquete_Main {
	// 【ハピタス】：クマクマ調査団
	public static void main(String[] args) {
		Happymile_Enquete enquete = new Happymile_Enquete();
		int point = enquete.execute();
		System.out.println(get_end_message(HAPITAS, MORIMORI_QUIZ, point));
	}
}
