package pointmall;

import static common.Common.*;
import static common.constant.PointConstants.*;

import pointmall.shindan.Pointmail_Shindan;

/**
 * =====================================================================================================================
 * 【プリぽん】：WEB診断
 * =====================================================================================================================
 *
 * @author kimC
 *
 */
public class Pc_Pointmail_WebShidan_Main {
	// 【プリぽん】：WEB診断
	public static void main(String[] args) {
		Pointmail_Shindan shindan= new Pointmail_Shindan();
		int point = shindan.execute();
		System.out.println(get_end_message(GENDAMA, WEB_SHINDAN, point));

	}

}
