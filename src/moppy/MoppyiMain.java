package moppy;

import moppy.shindan.Moppy_Shindan;

public class MoppyiMain {

	public static void main(String[] args) {
		// 「クマクマ調査団」ポイント
		Moppy_Shindan moppy_Shindan = new Moppy_Shindan();
		int reados_point = moppy_Shindan.execute();
		System.out.println(reados_point);
	}

}