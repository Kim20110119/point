package point.excute;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * =====================================================================================================================
 * 【ポイントサイト】：自動稼ぎ処理
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Point_Excute{

	/**
	 * コンストラクタ
	 */
	public Point_Excute() {
	}

	/**
	 * =================================================================================================================
	 * 自動稼ぎ処理処理
	 * =================================================================================================================
	 *
	 * @return int point_couont 獲得済みポイント
	 *
	 * @author kimC
	 *
	 */
	public void execute() {
		final Logger logger = Logger.getLogger("PointExcuteLogging");
		try {
		    // 出力ファイルを指定する
		    FileHandler fh = new FileHandler("PointExcuteLog.log");
		    // 出力フォーマットを指定する
		    fh.setFormatter(new java.util.logging.SimpleFormatter());
		    logger.addHandler(fh);
		} catch (IOException e) {
		    e.printStackTrace();
		}
		// ログを出力する
		logger.log(Level.FINEST, "ログ出力テスト：finest");
		logger.log(Level.FINER, "ログ出力テスト：finer");
		logger.log(Level.FINE, "ログ出力テスト：fine");
		logger.log(Level.CONFIG, "ログ出力テスト：config");
		logger.log(Level.INFO, "ログ出力テスト：info");
		logger.log(Level.WARNING, "ログ出力テスト：warning");
		logger.log(Level.SEVERE, "ログ出力テスト：severe");
	}
}
