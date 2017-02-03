package mydoki;

import static common.Common.*;
import static common.constant.PointConstants.*;

import mydoki.shindan.Mydoki_Shindan;

/**
 * =====================================================================================================================
 * 【mydoki】：WEB診断
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Mydoki_WebShidan_Main {
	// 【mydoki】：WEB診断
	public static void main(String[] args) {
		Mydoki_Shindan shindan= new Mydoki_Shindan();
		int point = shindan.execute();
		System.out.println(get_end_message(GENDAMA, WEB_SHINDAN, point));

	}

}
