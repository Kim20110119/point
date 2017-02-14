package moppy;

import moppy.ad_areas.Moppy_Ad_Enquete;
import moppy.ad_areas.Moppy_Election;
import moppy.ad_areas.Moppy_Reados;
import moppy.click_coin.Moppy_Click_Coin;
import moppy.enquete.Moppy_Enquete;
import moppy.research.Moppy_Research;
import moppy.shindan.Moppy_Shindan;
import moppy.sp.Sp_Moppy_Election;
import moppy.sp.Sp_Moppy_Reados;
import moppy.sp.Sp_Moppy_Shindan;

/**
 * =====================================================================================================================
 * 【モッピー】：自動化
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Moppy_Main {
	public static void main(String[] args) {
		// 「漫画アンケート」
		Moppy_Ad_Enquete pc_ad_enquete = new Moppy_Ad_Enquete();
		pc_ad_enquete.execute();
		// 「クマクマ総選挙」
		Moppy_Election pc_election = new Moppy_Election();
		pc_election.execute();
		// 「クマクマ調査団」
		Moppy_Reados pc_reados = new Moppy_Reados();
		pc_reados.execute();
		// 「毎日クリック」
		Moppy_Click_Coin pc_click_coin = new Moppy_Click_Coin();
		pc_click_coin.execute();
		// 「モッピーアンケート」
		Moppy_Enquete pc_enquete = new Moppy_Enquete();
		pc_enquete.execute();
		// 「モッピーリサーチ」
		Moppy_Research pc_research = new Moppy_Research();
		pc_research.execute();
		// 「モッピーWEB診断」
		Moppy_Shindan pc_shindan = new Moppy_Shindan();
		pc_shindan.execute();
		// 「クマクマ総選挙（携帯）」
		Sp_Moppy_Election sp_election = new Sp_Moppy_Election();
		sp_election.execute();
		// 「クマクマ調査団（携帯）」
		Sp_Moppy_Reados sp_reados = new Sp_Moppy_Reados();
		sp_reados.execute();
		// 「モッピーWEB診断（携帯）」
		Sp_Moppy_Shindan sp_shindan = new Sp_Moppy_Shindan();
		sp_shindan.execute();
		System.out.println("モッピー自動化完了");
	}
}