package gendama;

import gendama.shindan.Gendama_Shindan;

public class Pc_Gendama_WebShidan {

	public static void main(String[] args) {
		// げん玉：WEB診断
		Gendama_Shindan shindan= new Gendama_Shindan();
		shindan.execute();
		System.out.println("WEB診断終了");

	}

}
