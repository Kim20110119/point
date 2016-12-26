package gendama;

import static common.Common.*;
import static common.constant.PointConstants.*;

import gendama.mrga.Gendama_DiagnosisMediaAd;

/**
 * =====================================================================================================================
 * 【げん玉】：モリモリアンケート・診断
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Gendama_DiagnosisMediaAd_Main {
	// 【げん玉】：モリモリアンケート・診断
	public static void main(String[] args) {
		Gendama_DiagnosisMediaAd diagnosisMediaAd = new Gendama_DiagnosisMediaAd();
		int point = diagnosisMediaAd.execute();
		System.out.println(get_end_message(GENDAMA, DIAGNOSIS_MEDIA_AD, point));
	}

}