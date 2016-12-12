package common;

import java.util.Random;

/**
 * @author お客様
 *
 */
public class Common {
	/**
	 * 整数乱数を生成する処理.<BR>
	 *
	 * @param int
	 *            x 乱数の限界値
	 * @return int y [0]～[x-1]の値
	 *
	 */
	public static int int_random(int x) {
		// Randomクラスのインスタンス化
		Random rnd = new Random();
		return rnd.nextInt(x);
	}

	/**
	 * 文字列のマッチ判断する処理.<BR>
	 *
	 * @param String
	 *            str1 文字列
	 * @param String
	 *            str1 比較する文字列
	 * @return matche_flag
	 *
	 */
	public static boolean str_matche(String str1, String str2) {
		if (str1.matches(".*" + str2 + ".*")) {
			// マッチする
			return Boolean.TRUE;
		} else {
			// マッチしない
			return Boolean.FALSE;
		}
	}

}
