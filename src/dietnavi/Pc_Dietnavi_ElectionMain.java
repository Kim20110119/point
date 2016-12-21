package dietnavi;

import dietnavi.ad_areas.Dietnavi_Election;

/**
 * =====================================================================================================================
 * GetMoney：アンケート
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Dietnavi_ElectionMain {

	public static void main(String[] args) {
		// GetMoney：アンケート
		Dietnavi_Election forest = new Dietnavi_Election();
		int point = forest.execute();
		System.out.println("【GetMoney】アンケート終了。獲得済みのポイント" + point);
	}

}
