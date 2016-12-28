package common;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author お客様
 *
 */
public class Common {
	/**
	 * 整数乱数を生成する処理.<BR>
	 *
	 * @param int
	 *            x 乱数の限界値
	 * @return int y [0]～[x-1]の値
	 *
	 */
	public static int int_random(int x) {
		// Randomクラスのインスタンス化
		Random rnd = new Random();
		return rnd.nextInt(x);
	}

	/**
	 * 文字列のマッチ判断する処理.<BR>
	 *
	 * @param String
	 *            str1 文字列
	 * @param String
	 *            str1 比較する文字列
	 * @return matche_flag
	 *
	 */
	public static boolean str_matche(String str1, String str2) {
		if (str1.matches(".*" + str2 + ".*")) {
			// マッチする
			return Boolean.TRUE;
		} else {
			// マッチしない
			return Boolean.FALSE;
		}
	}

	/**
	 * 終了メッセージを取得する処理.<BR>
	 *
	 * @param String
	 *            site サイト名
	 * @param String
	 *            item 項目
	 * @param int
	 *            point ポイント
	 *
	 * @return String end_message 終了メッセージ
	 *
	 */
	public static String get_end_message(String site, String item, int point) {
		return "【" + site + "】：" + item + "終了。獲得ずみポイント：" + point;
	}

	/**
	 * =====================================================================================================================
	 * Proxyサーバー一覧を取得する
	 * =====================================================================================================================
	 *
	 * @author kimC
	 *
	 */
	public static List<String> getProxyList() {
		List<String> list=new ArrayList<String>();
		list.add("106.186.22.65:8888");
		list.add("219.127.253.43:80");
		list.add("219.166.7.50:80");
		list.add("43.229.204.102:8080");
		list.add("43.230.163.186:8080");
		list.add("43.231.23.101:8080");
		list.add("43.252.138.156:3128");
		list.add("121.94.173.145:80");
		list.add("160.202.40.203:8080");
		list.add("160.202.41.51:8080");
		list.add("160.202.42.10:8080");
		list.add("160.202.42.114:8080");
		list.add("160.202.42.122:8080");
		list.add("160.202.42.66:8080");
		list.add("160.202.42.74:8080");
		list.add("124.155.112.85:80");
		list.add("124.32.141.184:3128");
		list.add("151.80.135.147:3128");
		list.add("182.253.123.52:8080");
		list.add("118.98.122.226:8080");
		list.add("49.1.244.139:3128");
		list.add("203.153.20.5:3128");
		list.add("89.38.150.186:6742");
		list.add("123.30.238.16:3128");
		list.add("78.108.108.9:8080");
		list.add("94.177.242.218:3128");
		list.add("66.175.83.156:8080");
		list.add("221.141.2.52:8080");
		list.add("190.214.48.125:8080");
		list.add("91.121.195.198:31288");
		list.add("92.47.195.250:3128");
		list.add("200.167.191.227:9090");
		list.add("193.246.106.105:80");
		list.add("176.31.96.198:3128");
		list.add("115.166.118.83:8080");
		list.add("86.105.51.239:3128");
		list.add("88.199.164.137:8080");
		list.add("183.131.151.208:80");
		list.add("144.217.40.115:80");
		list.add("180.250.46.227:8080");
		list.add("220.248.229.45:3128");
		list.add("95.161.228.186:8080");
		list.add("94.177.224.103:3128");
		list.add("182.53.247.142:8080");
		list.add("178.63.157.84:1080");
		list.add("200.52.75.41:80");
		list.add("86.105.51.150:4646");
		list.add("118.101.37.209:8080");
		list.add("118.97.32.226:8080");
		list.add("213.221.56.213:3128");
		list.add("80.88.90.149:80");
		list.add("95.173.179.84:3128");
		list.add("176.31.113.42:8118");
		list.add("125.31.19.27:80");
		list.add("185.15.109.47:8080");
		list.add("154.16.127.52:8080");
		list.add("200.85.37.254:80");
		list.add("114.6.135.179:8080");
		list.add("197.237.218.89:8080");
		list.add("46.101.23.197:8118");
		list.add("200.68.27.100:3128");
		list.add("190.202.5.58:8080");
		list.add("149.56.41.35:80");
		list.add("188.113.138.238:3128");
		list.add("125.209.67.74:80");
		list.add("41.207.49.136:8080");
		list.add("103.4.250.18:9090");
		list.add("115.166.118.83:8080");
		list.add("163.47.147.34:8080");
		list.add("177.125.61.33:8080");
		list.add("83.220.168.131:80");
		list.add("81.201.58.106:8080");
		list.add("89.40.118.31:3128");
		list.add("58.59.141.187:3128");
		list.add("122.155.3.143:3128");
		list.add("149.56.123.105:3128");
		list.add("47.48.167.78:8080");
		list.add("207.188.73.155:80");
		list.add("163.121.188.2:8080");
		list.add("190.88.36.197:80");
		list.add("93.174.55.82:80");
		list.add("186.219.106.4:8080");
		list.add("124.120.28.179:3128");
		list.add("1.179.146.153:8080");
		list.add("182.253.202.122:8080");
		list.add("136.243.82.159:8118");
		list.add("154.16.127.52:80");
		list.add("187.17.19.143:8080");
		list.add("139.59.183.176:8118");
		list.add("197.220.193.137:443");
		list.add("182.253.197.60:80");
		list.add("125.162.140.49:3128");
		list.add("122.154.100.164:8080");
		list.add("177.87.10.162:8080");
		list.add("202.47.236.252:80");
		list.add("180.178.45.186:3128");
		list.add("77.174.83.147:80");
		list.add("95.78.251.33:3128");
		list.add("89.40.127.83:3128");
		list.add("124.133.230.254:80");
		list.add("41.59.67.58:8080");
		list.add("113.253.13.205:80");


		return list;
	}

}
