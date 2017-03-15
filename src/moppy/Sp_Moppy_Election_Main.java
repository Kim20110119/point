package moppy;

import moppy.sp.Sp_Moppy_Election;

/**
 * =====================================================================================================================
 * モッピー：クマクマ総選挙(携帯)
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Sp_Moppy_Election_Main {

	public static void main(String[] args) {
		Sp_Moppy_Election election = new Sp_Moppy_Election();
		int reados_point = election.execute();
		System.out.println(reados_point);
	}

}