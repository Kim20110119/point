package cmsite;

import static common.Common.*;
import static common.constant.PointConstants.*;

import cmsite.ad_areas.Cmsite_Election;

/**
 * =====================================================================================================================
 * 【CMサイト】：クマクマ総選挙
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Cmsite_Election_Main {
	// 【CMサイト】：クマクマ総選挙
	public static void main(String[] args) {
		Cmsite_Election forest = new Cmsite_Election();
		int point = forest.execute();
		System.out.println(get_end_message(CMSITE, ELECTION, point));
	}

}
