package gendama;

import gendama.mrga.Gendama_Quiz;

public class Pc_Gendama_Quiz {

	public static void main(String[] args) {
		// げん玉：モリモリアンケート・診断
		Gendama_Quiz quiz = new Gendama_Quiz();
		int point = quiz.execute();
		System.out.println("モリモリクイズ終了。獲得済みのポイント" + point);
	}

}
