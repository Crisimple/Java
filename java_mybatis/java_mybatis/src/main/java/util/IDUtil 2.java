package util;

import java.util.UUID;

/**
 * @Author sf
 * @File IDUtil
 * @Time 2021-04-09 10:14
 * @Description
 */
public class IDUtil {
	
	public static String getId(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
