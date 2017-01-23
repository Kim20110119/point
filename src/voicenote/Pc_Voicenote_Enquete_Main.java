package voicenote;

import voicenote.enquete.Voicenote_Enquete;

/**
 * =====================================================================================================================
 * ボイスノート：WEB診断
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Voicenote_Enquete_Main {

	public static void main(String[] args) {
		for(int i = 0; i < 30; i++ ){
			Voicenote_Enquete enquete = new Voicenote_Enquete();
			int get_point = enquete.execute();
			System.out.println(get_point);
		}

	}

}