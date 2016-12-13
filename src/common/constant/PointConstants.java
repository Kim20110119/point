package common.constant;

/**
 * =====================================================================================================================
 * ポイントサイトに使う定数
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class PointConstants {

	/**
	 * privateコンストラクタでインスタンス生成を抑止
	 */
	private PointConstants(){
	}

	//==================================================================================================================
	// げん玉
	//==================================================================================================================
	/** げん玉:ログインURL */
	public static final String GENDAMA_LOGIN_URL = "https://ssl.realworld.jp/auth/?site=gendama_jp&goto=http%3A%2F%2Fwww.gendama.jp%2F?p=start";
	/** げん玉:ポイントの森URL */
	public static final String GENDAMA_FOREST_URL = "http://www.gendama.jp/forest/";
	/** げん玉:モリゲーURL */
	public static final String GENDAMA_AD_ENQ_LIST_URL = "http://mrga.service-navi.jp/ad/enq/list";
	/** げん玉:CMくじURL */
	public static final String GENDAMA_CM_URL = "http://www.gendama.jp/cl/?id=138368&u=1";
	/** げん玉:WEB診断URL */
	public static final String GENDAMA_WEB_SHINDAN_URL = "http://shindan-apps.net/gendama?uid=6187765";

	/** げん玉(携帯):CMくじURL */
	public static final String SP_GENDAMA_CM_URL = "http://www.gendama.jp/cl/?id=134510&rt=s&u=6187765";
	/** げん玉(携帯):森のポイントURL */
	public static final String SP_GENDAMA_WEB_SHINDAN_URL = "http://www.gendama.jp/sp/more_point";

	/** げん玉:ログインメールアドレス */
	public static final String GENDAMA_LOGIN_MAIL = "kimyea002@hotmail.com";
	/** げん玉:ログインパスワード */
	public static final String GENDAMA_LOGIN_PASSWORD = "20110119Jjz";
	/** げん玉:モリモリ診断URL */
	public static final String GENDAMA_ADSURVEY_URL = ".*http://adsurvey.media-ad.jp/.*";
	/** げん玉:モリモリアンケートURL */
	public static final String GENDAMA_MRGA_URL = ".*http://mrga.service-navi.jp/.*";
	/** げん玉:多数決本日終了メッセージ */
	public static final String GENDAMA_END_MESSAGE = ".*ポイントがもらえる質問がありません！また明日来てね！.*";

	//==================================================================================================================
	//==================================================================================================================
	// ポイントインカム
	//==================================================================================================================
	//==================================================================================================================
	// URL
	/** ポイントインカム:ログインURL */
	public static final String POINTI_LOGIN_URL = "http://pointi.jp/";
	/** ポイントインカム:CMくじURL */
	public static final String POINTI_CF_URL = "http://pointi.jp/cf/";
	/** ポイントインカム:リサーチURL */
	public static final String POINTI_RESEARCH_URL = "http://pointi.jp/contents/research/";
	/** ポイントインカム:WEB診断URL */
	public static final String POINTI_WEB_SHINDAN_URL = "http://shindan-apps.net/pointi?uid=38800457205gf69hj2rpgrofhp8v";
	/** ポイントインカム:プライス調査隊URL */
	public static final String POINTI_PRICES_URL = "http://pointi.jp/api/prices.php";



	// ログイン情報
	/** ポイントインカム:ログインメールアドレス */
	public static final String POINTI_LOGIN_MAIL = "kim20110119@hotmail.com";
	/** ポイントインカム:ログインパスワード */
	public static final String POINTI_LOGIN_PASSWORD = "20110119Jjz";

	//==================================================================================================================
	// モッピー
	//==================================================================================================================
	/** モッピー:ログインURL */
	public static final String MOPPY_LOGIN_URL = "https://ssl.pc.moppy.jp/login/";
	/** モッピー:ログインメールアドレス */
	public static final String MOPPY_LOGIN_MAIL = "kim-c@softbank.ne.jp";
	/** モッピー:ログインパスワード */
	public static final String MOPPY_LOGIN_PASSWORD = "20110119Jjz";
	/** モッピー:ゲームコンテンツURL */
	public static final String MOPPY_GAMECONTENTS_URL = "http://pc.moppy.jp/gamecontents/";
	/** モッピー:ゲームコンテンツURL */
	public static final String MOPPY_CM_URL = "http://pc.moppy.jp/forward/?t=12489";

	//==================================================================================================================
	// 共通
	//==================================================================================================================
	/** 共通：「診断」文字列 */
	public static final String S_SINDAN = ".*診断.*";
	/** 共通：「アンケート」文字列 */
	public static final String S_ENQUETE = ".*アンケート.*";
	/** 「0」 */
	public static final int INT_0 = 0;
	/** 「1」 */
	public static final int INT_1 = 1;
	/** 「2」 */
	public static final int INT_2 = 2;
	/** 「3」 */
	public static final int INT_3 = 3;
	/** 「4」 */
	public static final int INT_4 = 4;
	/** 「5」 */
	public static final int INT_5 = 5;
	/** 「6」 */
	public static final int INT_6 = 6;
	/** 「7」 */
	public static final int INT_7 = 7;
	/** 「8」 */
	public static final int INT_8 = 8;
	/** 「9」 */
	public static final int INT_9 = 9;
}
