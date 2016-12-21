package pointi;

import pointi.enquete.Pointi_WebInterview;

/**
 * =====================================================================================================================
 * ポイントインカム：Webインタビュー
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Pointi_WebInterviewMain {

	public static void main(String[] args) {
		// 「Webインタビュー」ポイント
		Pointi_WebInterview webInterview = new Pointi_WebInterview();
		int point = webInterview.execute();
		System.out.println("【ポイントインカム】Webインタビュー終了。獲得済みのポイント" + point);
	}

}