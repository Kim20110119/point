package moppy;

import static common.constant.HtmlConstants.*;
import static common.constant.PointConstants.*;

import common.Point;

public class Moppy extends Point  {

	public Moppy() {
		// モッピー：ログイン画面
		driver.get(MOPPY_LOGIN_URL);
		// モッピー：ログインメールアドレス
		sendkeysByStr(getByName(V_MAIL), MOPPY_LOGIN_MAIL);
		// モッピー：ログインパスワード
		sendkeysByStr(getByName(V_PASS), MOPPY_LOGIN_PASSWORD);
		// モッピー：ログインボタン
		click(getByXpath(T_BUTTON, A_TYPE, V_SUBMIT));
	}

}
