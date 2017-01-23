package pointtown;

import static common.Common.*;
import static common.constant.PointConstants.*;

import pointtown.ad_areas.Pointtown_Election;

/**
 * =====================================================================================================================
 * 【ポイントタウン】：クマクマ総選挙
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Pointtown_Election_Main {
	// 【ポイントタウン】：クマクマ総選挙
	public static void main(String[] args) {
		Pointtown_Election election = new Pointtown_Election();
		int point = election.execute();
		System.out.println(get_end_message(HAPITAS, MORIMORI_QUIZ, point));
	}
}
