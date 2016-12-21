package dietnavi;

import dietnavi.enquete.Dietnavi_Enquete;

/**
 * =====================================================================================================================
 * GetMoney：アンケート
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Dietnavi_EnqueteMain {

	public static void main(String[] args) {
		// GetMoney：アンケート
		Dietnavi_Enquete enquete = new Dietnavi_Enquete();
		int point = enquete.execute();
		System.out.println("【GetMoney】アンケート終了。獲得済みのポイント" + point);
	}

}
