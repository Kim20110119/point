package cmsite;

import static common.Common.*;
import static common.constant.PointConstants.*;

import cmsite.shindan.Cmsite_Shindan;

/**
 * =====================================================================================================================
 * 【CMサイト】：WEB診断
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Cmsite_WebShidan_Main {
	// 【CMサイト】：WEB診断
	public static void main(String[] args) {
		Cmsite_Shindan shindan= new Cmsite_Shindan();
		int point = shindan.execute();
		System.out.println(get_end_message(CMSITE, WEB_SHINDAN, point));
	}
}
