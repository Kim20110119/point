package common.constant;

/**
 * =====================================================================================================================
 * 【チャンスイット】:定数
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class pointStadiumConstants {

	/**
	 * privateコンストラクタでインスタンス生成を抑止
	 */
	private pointStadiumConstants() {
	}

	/** 【PC】ログインURL */
	public static final String PC_LOGIN_URL = "https://www.point-stadium.com/loginw.asp";
	/** 【PC】CMくじURL */
	public static final String PC_CM_URL = "http://www.point-stadium.com/wcmpoint.asp";

	/** 【PC】ログインメールアドレス */
	public static final String PC_LOGIN_MAIL = "kim20110119@hotmail.com";
	/** 【PC】ログインパスワード */
	public static final String PC_LOGIN_PASSWORD = "20110119";
	/** 【PC】モリモリ診断URL */
	public static final String PC_ADSURVEY_URL = ".*http://adsurvey.media-ad.jp/.*";
	/** 【PC】モリモリMRGAアンケートURL */
	public static final String PC_MRGA_URL = ".*http://mrga.service-navi.jp/.*";
	/** 【PC】モリモリCOLUMNアンケートURL */
	public static final String PC_COLUMN_URL = ".*http://column-enquete-reado.com/.*";

	/** 【PC】多数決本日終了メッセージ */
	public static final String PC_END_MESSAGE = ".*ポイントがもらえる質問がありません！また明日来てね！.*";

}
