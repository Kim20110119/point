package common.constant;

/**
 * =====================================================================================================================
 * 【ハピタス】:定数
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class HapitasConstants {

	/**
	 * privateコンストラクタでインスタンス生成を抑止
	 */
	private HapitasConstants() {
	}

	// ==================================================================================================================
	// URL
	// ==================================================================================================================
	/** 【PC】:ログインURL */
	public static final String PC_LOGIN_URL = "https://hapitas.jp/auth/signin";
	/** 【PC】:アンケートURL */
	public static final String PC_ENQUETE_URL = "http://pc.moppy.jp/research/";
	/** 【PC】:ゲームコンテンツURL */
	public static final String PC_CM_URL = "https://hapitas.jp/item/redirect/itemid/55234/p/0/apn/movie";
	/** 【PC】:ゲームコンテンツURL */
	public static final String PC_REDIRECT_CM_URL = "https://hapitas.jp/auth/signin?redirect=%252Fitem%252Fredirect%252Fitemid%252F55234%252Fp%252F0%252Fapn%252Fmovie";

	// ==================================================================================================================
	// アカウント情報
	// ==================================================================================================================
	/** 【PC】:ログインメールアドレス */
	public static final String PC_LOGIN_MAIL = "kimyea.005@gmail.com";
	/** 【PC】:ログインパスワード */
	public static final String PC_LOGIN_PASSWORD = "20110119Jjz";
}
