package gendama;

import gendama.sp.Sp_Gendama_Shindan;

public class Sp_WebShidanGendama {

	public static void main(String[] args) {
		// げん玉：WEB診断
		Sp_Gendama_Shindan shindan= new Sp_Gendama_Shindan();
		shindan.execute();
		System.out.println("WEB診断終了");

	}

}
