package point;

import point.excute.Point_Excute;

/**
 * =====================================================================================================================
 * 【ポイントサイト】：メイン処理
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Point_Main {
	// 【ポイントサイト】：メイン処理
	public static void main(String[] args) {
		Point_Excute excute = new Point_Excute();
		excute.execute();
		System.out.println("メイン処理終了");
	}

}