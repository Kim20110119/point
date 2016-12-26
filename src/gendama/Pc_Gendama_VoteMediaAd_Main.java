package gendama;

import static common.Common.*;
import static common.constant.PointConstants.*;

import gendama.mrga.Gendama_VoteMediaAd;

/**
 * =====================================================================================================================
 * 【げん玉】：モリモリ多数決
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Gendama_VoteMediaAd_Main {
	// 【げん玉】：モリモリ多数決
	public static void main(String[] args) {
		Gendama_VoteMediaAd voteMediaAd = new Gendama_VoteMediaAd();
		int point = voteMediaAd.execute();
		System.out.println(get_end_message(GENDAMA, VOTE_MEDIA_AD, point));
	}

}
