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
	 * @param int x 乱数の限界値
	 * @return int y [0]～[x-1]の値
	 *
	 */
	public static int int_random(int x){
		// Randomクラスのインスタンス化
		Random rnd = new Random();
		return rnd.nextInt(x);
	}
}
