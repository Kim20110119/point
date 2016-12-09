package gendama;

import gendama.ad_areas.Gendama_LocalQuizs;

public class LocalQuizsMain {

	public static void main(String[] args) {
		// げん玉：ザ・ご当地検定
		Gendama_LocalQuizs localQuizs = new Gendama_LocalQuizs();
		localQuizs.execute();
		System.out.println("当地検定終了");

	}

}
