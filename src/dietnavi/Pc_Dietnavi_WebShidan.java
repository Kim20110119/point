package dietnavi;

import dietnavi.shindan.Dietnavi_Shindan;

/**
 * =====================================================================================================================
 * GetMoney：WEB診断
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Dietnavi_WebShidan {

	public static void main(String[] args) {
		// GetMoney：WEB診断
		Dietnavi_Shindan shindan= new Dietnavi_Shindan();
		int point = shindan.execute();
		System.out.println("【GetMoney】WEB診断終了。獲得済みポイント：" + point);

	}

}
