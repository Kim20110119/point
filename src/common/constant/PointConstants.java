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
	private PointConstants() {
	}

	/** 【げん玉】 */
	public static final String GENDAMA = "げん玉";
	/** 【森のポイント】 */
	public static final String FOREST = "ポイントの森";
	/** 【モリモリアンケート・診断】 */
	public static final String DIAGNOSIS_MEDIA_AD = "モリモリアンケート・診断";
	/** 【モリモリクイズ】 */
	public static final String MORIMORI_QUIZ = "モリモリクイズ";
	/** 【モリモリ多数決】 */
	public static final String VOTE_MEDIA_AD = "モリモリ多数決";
	/** 【リアルワールド】 */
	public static final String REALWORLD = "リアルワールド";
	/** 【お財布】 */
	public static final String OSAIFU = "お財布";
	/** 【ハピタス】 */
	public static final String HAPITAS = "ハピタス";
	/** 【CMサイト】 */
	public static final String CMSITE = "CMサイト";

	/** 【クマクマ総選挙】 */
	public static final String ELECTION = "クマクマ総選挙";
	/** 【クマクマ調査団】 */
	public static final String READOS = "クマクマ調査団";
	/** 【ザ・ご当地検定】 */
	public static final String LOCAL_QUIZS = "ザ・ご当地検定";
	/** 【漫画アンケート】 */
	public static final String MANGA_ENQUETE = "漫画アンケート";
	/** 【WEB診断】 */
	public static final String WEB_SHINDAN = "WEB診断";
	/** 【ADリサーチ】 */
	public static final String AD_RESEARCH = "ADリサーチ";




	// ==================================================================================================================
	// 【げん玉】
	// ==================================================================================================================
	/** 【げん玉】:ログインURL */
	public static final String GENDAMA_LOGIN_URL = "https://ssl.realworld.jp/auth/?site=gendama_jp&goto=http%3A%2F%2Fwww.gendama.jp%2F?p=start";
	/** 【げん玉】:ポイントの森URL */
	public static final String GENDAMA_FOREST_URL = "http://www.gendama.jp/forest/";
	/** 【げん玉】:モリゲーURL */
	public static final String GENDAMA_AD_ENQ_LIST_URL = "http://mrga.service-navi.jp/ad/enq/list";
	/** 【げん玉】:CMくじURL */
	public static final String GENDAMA_CM_URL = "http://www.gendama.jp/cl/?id=138368&u=1";
	/** 【げん玉】:WEB診断URL */
	public static final String GENDAMA_WEB_SHINDAN_URL = "http://shindan-apps.net/gendama?uid=6285120";
	/** 【げん玉】:モリゲーURL */
	public static final String GENDAMA_MRGA_SERVICE_URL = "http://mrga.service-navi.jp/collection";
	/** 【げん玉】:モリモリクイズURL */
	public static final String GENDAMA_MRGA_QUIZ_URL = "http://mrga.service-navi.jp/login/redirectqp";

	/** 【げん玉】(携帯):CMくじURL */
	public static final String SP_GENDAMA_CM_URL = "http://www.gendama.jp/cl/?id=134510&rt=s&u=6285120";
	/** 【げん玉】(携帯):WEB診断URL */
	public static final String SP_GENDAMA_WEB_SHINDAN_URL = "http://www.gendama.jp/sp/more_point";
	/** 【げん玉】(携帯):ポイントの森URL */
	public static final String SP_GENDAMA_FOREST_URL = "http://www.gendama.jp/sp/forest";

	/** 【げん玉】:ログインメールアドレス */
	public static final String GENDAMA_LOGIN_MAIL = "kimkeitetsu@gmail.com";
	/** 【げん玉】:ログインパスワード */
	public static final String GENDAMA_LOGIN_PASSWORD = "20160801Kim";
	/** 【げん玉】:モリモリ診断URL */
	public static final String GENDAMA_ADSURVEY_URL = ".*http://adsurvey.media-ad.jp/.*";
	/** 【げん玉】:モリモリMRGAアンケートURL */
	public static final String GENDAMA_MRGA_URL = ".*http://mrga.service-navi.jp/.*";
	/** 【げん玉】:モリモリCOLUMNアンケートURL */
	public static final String GENDAMA_COLUMN_URL = ".*http://column-enquete-reado.com/.*";

	/** 【げん玉】:多数決本日終了メッセージ */
	public static final String GENDAMA_END_MESSAGE = ".*ポイントがもらえる質問がありません！また明日来てね！.*";

	// ==================================================================================================================
	// 【リアルワールド】
	// ==================================================================================================================
	/** 【リアルワールド】:ログインURL */
	public static final String REALWORLD_LOGIN_URL = "https://ssl.realworld.jp/auth?goto=http%3A%2F%2Frealworld.jp";
	/** 【リアルワールド】:CMくじURL */
	public static final String REALWORLD_CM_URL = "http://www.gendama.jp/cl/?id=231331";

	/** 【リアルワールド】:ログインメールアドレス */
	public static final String REALWORLD_LOGIN_MAIL = "kimkeitetsu@gmail.com";
	/** 【リアルワールド】:ログインパスワード */
	public static final String REALWORLD_LOGIN_PASSWORD = "20160801Kim";

	// ==================================================================================================================
	// ==================================================================================================================
	// 【ポイントインカム】
	// ==================================================================================================================
	// ==================================================================================================================
	// URL
	/** 【ポイントインカム】:ログインURL */
	public static final String POINTI_LOGIN_URL = "http://pointi.jp/";
	/** 【ポイントインカム】:CMくじURL */
	public static final String POINTI_CF_URL = "http://pointi.jp/cf/";
	/** 【ポイントインカム】:リサーチURL */
	public static final String POINTI_RESEARCH_URL = "http://pointi.jp/contents/research/";
	/** 【ポイントインカム】:WEB診断URL */
	public static final String POINTI_WEB_SHINDAN_URL = "http://shindan-apps.net/pointi?uid=38800457205gf69hj2rpgrofhp8v";
	/** 【ポイントインカム】:プライス調査隊URL */
	public static final String POINTI_PRICES_URL = "http://pointi.jp/api/prices.php";

	// ログイン情報
	/** 【ポイントインカム】:ログインメールアドレス */
	public static final String POINTI_LOGIN_MAIL = "kimkeitetsu@gmail.com";
	/** 【ポイントインカム】:ログインパスワード */
	public static final String POINTI_LOGIN_PASSWORD = "20160801Kim";

	// ==================================================================================================================
	// 【ポイントランド】
	// ==================================================================================================================
	/** 【ポイントランド】:ログインURL */
	public static final String POINT_LAND_LOGIN_URL = "https://www.point-land.net/loginw.asp";
	/** 【ポイントランド】:CMくじURL */
	public static final String POINT_LAND_CM_URL = "http://www.point-land.net/wcmpoint.asp";
	/** 【ポイントランド】:アンケート&診断URL */
	public static final String POINT_LAND_ENQUETE_SHINDAN_URL = "http://www.point-land.net/wenqr.asp";

	/** 【ポイントランド】:ログインメールアドレス */
	public static final String POINT_LAND_LOGIN_MAIL = "kim20110119@hotmail.com";
	/** 【ポイントランド】:ログインパスワード */
	public static final String POINT_LAND_LOGIN_PASSWORD = "20110119Jjz";

	// ==================================================================================================================
	// 【I2I】
	// ==================================================================================================================
	/** 【I2I】:ログインURL */
	public static final String I2I_LOGIN_URL = "https://id.i2i.jp/usr/login.php?usr=&goto=https%3A%2F%2Fpoint.i2i.jp%2Fservice%2Flogin%3Furl%3D";

	/** 【I2I】:ログインメールアドレス */
	public static final String I2I_LOGIN_MAIL = "kimyea.008@gmail.com";
	/** 【I2I】:ログインパスワード */
	public static final String I2I_LOGIN_PASSWORD = "20110119Jjz";

	// ==================================================================================================================
	// 【ちょびリッチ】
	// ==================================================================================================================
	/** 【ちょびリッチ】:ログインURL */
	public static final String CHOBIRICH_LOGIN_URL = "https://www.chobirich.com/account/";
	/** 【ちょびリッチ】:CMくじURL */
	public static final String CHOBIRICH_CM_URL = "https://www.chobirich.com/ad_details/member_only/1020576/";

	/** 【ちょびリッチ】:ログインメールアドレス */
	public static final String CHOBIRICH_LOGIN_MAIL = "2973007";
	/** 【ちょびリッチ】:ログインパスワード */
	public static final String CHOBIRICH_LOGIN_PASSWORD = "20110119Jjz";

	// ==================================================================================================================
	// 【共通】
	// ==================================================================================================================
	/** 【共通】：「診断」文字列 */
	public static final String S_SINDAN = ".*診断.*";
	/** 【共通】：「アンケート」文字列 */
	public static final String S_ENQUETE = ".*アンケート.*";

	// ==================================================================================================================
	// 【整数】
	// ==================================================================================================================
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
