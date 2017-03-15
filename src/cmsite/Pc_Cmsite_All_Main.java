package cmsite;

import cmsite.ad_areas.Cmsite_Election;
import cmsite.ad_areas.Cmsite_Enquete;
import cmsite.ad_areas.Cmsite_LocalQuizs;
import cmsite.ad_areas.Cmsite_Reados;
import cmsite.enquete.Cmsite_Ad_Research;
import cmsite.enquete.Cmsite_Job_Enquete;
import cmsite.enquete.Cmsite_Manga_Enquete;
import cmsite.shindan.Cmsite_Shindan;

/**
 * =====================================================================================================================
 * 【CMサイト】：自動化
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Cmsite_All_Main {
	// 【CMサイト】：自動化
	public static void main(String[] args) {
		// WEB診断
		Cmsite_Shindan shindan= new Cmsite_Shindan();
		shindan.execute();
		// 漫画アンケート
		Cmsite_Enquete enquete = new Cmsite_Enquete();
		enquete.execute();
		// ADリサーチ
		Cmsite_Ad_Research research = new Cmsite_Ad_Research();
		research.execute();
		// ジョブアンケート
		Cmsite_Job_Enquete job_enquete = new Cmsite_Job_Enquete();
		job_enquete.execute();
		// ザ・ご当地検定
		Cmsite_LocalQuizs local_quizs = new Cmsite_LocalQuizs();
		local_quizs.execute();
		// 漫画アンケート
		Cmsite_Manga_Enquete manga_enquete = new Cmsite_Manga_Enquete();
		manga_enquete.execute();
		// クマクマ調査団
		Cmsite_Reados reados = new Cmsite_Reados();
		reados.execute();
		// クマクマ総選挙
		Cmsite_Election forest = new Cmsite_Election();
		forest.execute();
		System.out.println("【CMサイト】：自動化処理完了");
	}
}
