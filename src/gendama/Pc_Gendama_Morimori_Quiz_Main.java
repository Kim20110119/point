package gendama;

import static common.Common.*;
import static common.constant.PointConstants.*;

import gendama.mrga.Gendama_Quiz;

/**
 * =====================================================================================================================
 * 【げん玉】：モリモリクイズ
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Gendama_Morimori_Quiz_Main {
	// げん玉：モリモリクイズ
	public static void main(String[] args) {
		Gendama_Quiz quiz = new Gendama_Quiz();
		int point = quiz.execute();
		System.out.println(get_end_message(GENDAMA, MORIMORI_QUIZ, point));
	}
}
