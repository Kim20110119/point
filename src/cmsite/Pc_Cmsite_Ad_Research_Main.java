package cmsite;

import static common.Common.*;
import static common.constant.PointConstants.*;

import cmsite.enquete.Cmsite_Ad_Research;

/**
 * =====================================================================================================================
 * 【CMサイト】：ADリサーチ
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Cmsite_Ad_Research_Main {
	// 【CMサイト】：ADリサーチ
	public static void main(String[] args) {
		Cmsite_Ad_Research research = new Cmsite_Ad_Research();
		int point = research.execute();
		System.out.println(get_end_message(CMSITE, AD_RESEARCH, point));
	}

}