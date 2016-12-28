package cmsite;

import static common.Common.*;
import static common.constant.PointConstants.*;

import cmsite.enquete.Cmsite_Job_Enquete;

/**
 * =====================================================================================================================
 * 【CMサイト】：ジョブアンケート
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Cmsite_Job_Enquete_Main {
	// 【CMサイト】：ジョブアンケート
	public static void main(String[] args) {
		Cmsite_Job_Enquete reados = new Cmsite_Job_Enquete();
		int point = reados.execute();
		System.out.println(get_end_message(CMSITE, MORIMORI_QUIZ, point));
	}
}
