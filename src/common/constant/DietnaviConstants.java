package common.constant;

/**
 * =====================================================================================================================
 * 【GetMoney】:定数
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class DietnaviConstants {

	/**
	 * privateコンストラクタでインスタンス生成を抑止
	 */
	private DietnaviConstants() {
	}

	/** 【PC】ログインURL */
	public static final String PC_LOGIN_URL = "https://dietnavi.com/pc/login.php?next_url=http://dietnavi.com/pc/";
	/** 【PC】CMくじURL */
	public static final String PC_CM_URL = "http://dietnavi.com/pc/ad_jump.php?id=34856";
	/** 【PC】トイダスURL */
	public static final String PC_TOIDAS_URL = "http://dietnavi.com/pc/ad_jump.php?id=42431";
	/** 【PC】アンケートURL */
	public static final String PC_ENQUETE_URL = "http://dietnavi.com/pc/survey/";


	/** 【PC】WEB診断URL */
	public static final String PC_WEB_SHINDAN_URL = "http://shindan-apps.net/getmoney?uid=3088603";
	/** 【PC】モリゲーURL */
	public static final String PC_MRGA_SERVICE_URL = "http://mrga.service-navi.jp/collection";
	/** 【PC】モリモリクイズURL */
	public static final String PC_MRGA_QUIZ_URL = "http://mrga.service-navi.jp/login/redirectqp";

	/** 【SP】:CMくじURL */
	public static final String SP_CM_URL = "http://www.gendama.jp/cl/?id=134510&rt=s&u=6278067";
	/** 【SP】:WEB診断URL */
	public static final String SP_WEB_SHINDAN_URL = "http://www.gendama.jp/sp/more_point";
	/** 【SP】:ポイントの森URL */
	public static final String SP_FOREST_URL = "http://www.gendama.jp/sp/forest";

	/** 【PC】ログインメールアドレス */
	public static final String PC_LOGIN_MAIL = "kimyea001@hotmail.com";
	/** 【PC】ログインパスワード */
	public static final String PC_LOGIN_PASSWORD = "20110119Jjz";
	/** 【PC】モリモリ診断URL */
	public static final String PC_ADSURVEY_URL = ".*http://adsurvey.media-ad.jp/.*";
	/** 【PC】モリモリMRGAアンケートURL */
	public static final String PC_MRGA_URL = ".*http://mrga.service-navi.jp/.*";
	/** 【PC】モリモリCOLUMNアンケートURL */
	public static final String PC_COLUMN_URL = ".*http://column-enquete-reado.com/.*";

	/** 【PC】多数決本日終了メッセージ */
	public static final String PC_END_MESSAGE = ".*ポイントがもらえる質問がありません！また明日来てね！.*";

}
