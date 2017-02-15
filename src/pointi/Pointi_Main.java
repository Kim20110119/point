package pointi;

import pointi.ad_areas.Pointi_Election;
import pointi.ad_areas.Pointi_LocalQuizs;
import pointi.ad_areas.Pointi_Reados;
import pointi.enquete.Pointi_WebInterview;
import pointi.shindan.Pointi_Shindan;

/**
 * =====================================================================================================================
 * ポイントインカム：プライス調査隊
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pointi_Main {

	public static void main(String[] args) {
		Pointi_Election election = new Pointi_Election();
		election.execute();
		Pointi_LocalQuizs localQuizs = new Pointi_LocalQuizs();
		localQuizs.execute();
		Pointi_Reados reados = new Pointi_Reados();
		reados.execute();
		Pointi_WebInterview webInterview = new Pointi_WebInterview();
		webInterview.execute();
		Pointi_Shindan whindan = new Pointi_Shindan();
		whindan.execute();
		System.out.println("ポイントインカム自動化終了");
	}

}