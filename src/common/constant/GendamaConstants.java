package common.constant;

/**
 * =====================================================================================================================
 * 【げん玉】：定数
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class GendamaConstants {

	/**
	 * privateコンストラクタでインスタンス生成を抑止
	 */
	private GendamaConstants() {
	}

	/** 【PC】：ログインURL */
	public static final String PC_LOGIN_URL = "https://ssl.realworld.jp/auth/?site=PC_jp&goto=http%3A%2F%2Fwww.gendama.jp%2F?p=start";
	/** 【PC】：ポイントの森URL */
	public static final String PC_FOREST_URL = "http://www.gendama.jp/forest/";
	/** 【PC】：モリゲーURL */
	public static final String PC_AD_ENQ_LIST_URL = "http://mrga.service-navi.jp/ad/enq/list";
	/** 【PC】：CMくじURL */
	public static final String PC_CM_URL = "http://www.gendama.jp/cl/?id=138368&u=1";
	/** 【PC】：WEB診断URL */
	public static final String PC_WEB_SHINDAN_URL = "http://shindan-apps.net/gendama?uid=6285120";
	/** 【PC】：モリゲーURL */
	public static final String PC_MRGA_SERVICE_URL = "http://mrga.service-navi.jp/collection";
	/** 【PC】：モリモリクイズURL */
	public static final String PC_MRGA_QUIZ_URL = "http://mrga.service-navi.jp/login/redirectqp";

	/** 【SP】CMくじURL */
	public static final String SP_CM_URL = "http://www.gendama.jp/cl/?id=134510&rt=s&u=6285120";
	/** 【SP】WEB診断URL */
	public static final String SP_WEB_SHINDAN_URL = "http://www.gendama.jp/sp/more_point";
	/** 【SP】ポイントの森URL */
	public static final String SP_FOREST_URL = "http://www.gendama.jp/sp/forest";

	/** 【PC】：ログインメールアドレス */
	public static final String PC_LOGIN_MAIL = "kimkeitetsu@gmail.com";
	/** 【PC】：ログインパスワード */
	public static final String PC_LOGIN_PASSWORD = "20160801Kim";
	/** 【PC】：モリモリ診断URL */
	public static final String PC_ADSURVEY_URL = ".*http://adsurvey.media-ad.jp/.*";
	/** 【PC】：モリモリMRGAアンケートURL */
	public static final String PC_MRGA_URL = ".*http://mrga.service-navi.jp/.*";
	/** 【PC】：モリモリCOLUMNアンケートURL */
	public static final String PC_COLUMN_URL = ".*http://column-enquete-reado.com/.*";

	/** 【PC】：多数決本日終了メッセージ */
	public static final String PC_END_MESSAGE = ".*ポイントがもらえる質問がありません！また明日来てね！.*";
}
