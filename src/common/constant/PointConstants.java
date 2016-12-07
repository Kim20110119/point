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
	// げん玉
	//==================================================================================================================
	/** ポイントインカム:ログインURL */
	public static final String POINTI_LOGIN_URL = "http://pointi.jp/";
	/** ポイントインカム:CMくじ */
	public static final String POINTI_CF_URL = "http://pointi.jp/cf/";
	/** ポイントインカム:ログインメールアドレス */
	public static final String POINTI_LOGIN_MAIL = "kim20110119@hotmail.com";
	/** ポイントインカム:ログインパスワード */
	public static final String POINTI_LOGIN_PASSWORD = "20110119Jjz";

	//==================================================================================================================
	// げん玉
	//==================================================================================================================
	/** 共通：「診断」文字列 */
	public static final String S_SINDAN = ".*診断.*";
	/** 共通：「アンケート」文字列 */
	public static final String S_ENQUETE = ".*アンケート.*";
}
