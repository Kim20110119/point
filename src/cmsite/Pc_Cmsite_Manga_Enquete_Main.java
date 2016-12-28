package cmsite;

import static common.Common.*;
import static common.constant.PointConstants.*;

import cmsite.enquete.Cmsite_Manga_Enquete;

/**
 * =====================================================================================================================
 * 【CMサイト】：漫画アンケート
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Cmsite_Manga_Enquete_Main {
	// 【CMサイト】：漫画アンケート
	public static void main(String[] args) {
		Cmsite_Manga_Enquete enquete = new Cmsite_Manga_Enquete();
		int point = enquete.execute();
		System.out.println(get_end_message(CMSITE, MANGA_ENQUETE, point));
	}

}
