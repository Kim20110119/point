package happymile;

import static common.constant.HappymileConstants.*;

import common.Point;

/**
 * 【ハピタス】：共通処理
 *
 * @author kimC
 *
 */
public class Pc_Happymile extends Point {

	public Pc_Happymile() {
		// 【ハピタス】：ログイン画面
		driver.get(PC_LOGIN_URL);
	}

}
