package gendama;

import gendama.ad_areas.Reados;
import gendama.click.DiagnosisMediaAd;

public class Gendama {

	public static void main(String[] args) {
		// げん玉：クマクマ調査団
		Reados reados = new Reados();
		reados.execute();
		// げん玉：モリモリアンケート
		DiagnosisMediaAd dma = new DiagnosisMediaAd();
		String end = dma.execute();
		System.out.println(end);

	}

}
