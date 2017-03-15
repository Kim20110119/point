package hapitas;

import hapitas.ad_areas.Hapitas_Enquete;
import hapitas.ad_areas.Hapitas_LocalQuizs;
import hapitas.ad_areas.Hapitas_Reados;

/**
 * =====================================================================================================================
 * 【ハピタス】：クマクマ調査団
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Hapitas_All_Main {
	// 【ハピタス】：クマクマ調査団
	public static void main(String[] args) {
		Hapitas_Enquete enquete = new Hapitas_Enquete();
		enquete.execute();
		Hapitas_LocalQuizs localQuizs = new Hapitas_LocalQuizs();
		localQuizs.execute();
		Hapitas_Reados reados = new Hapitas_Reados();
		reados.execute();
		System.out.println("ハッピータス自動化完了");
	}
}
