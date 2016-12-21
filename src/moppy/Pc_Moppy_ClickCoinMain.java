package moppy;

import moppy.click_coin.Moppy_Click_Coin;

public class Pc_Moppy_ClickCoinMain {

	public static void main(String[] args) {
		// モッピー：クマクマ総選挙
		Moppy_Click_Coin mcc = new Moppy_Click_Coin();
		int point = mcc.execute();
		System.out.println("毎日バナークリック終了。獲得済みポイント"+point);
	}

}