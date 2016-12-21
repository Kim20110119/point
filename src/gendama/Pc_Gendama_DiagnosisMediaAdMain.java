package gendama;

import gendama.mrga.Gendama_DiagnosisMediaAd;

/**
 * =====================================================================================================================
 * げん玉：モリモリアンケート・診断
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Gendama_DiagnosisMediaAdMain {

	public static void main(String[] args) {
		// げん玉：モリモリアンケート・診断
		Gendama_DiagnosisMediaAd diagnosisMediaAd = new Gendama_DiagnosisMediaAd();
		int point = diagnosisMediaAd.execute();
		System.out.println("モリモリアンケート・診断終了。獲得済みのポイント" + point);
	}

}