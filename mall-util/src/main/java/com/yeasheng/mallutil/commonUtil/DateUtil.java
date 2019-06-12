package com.yeasheng.mallutil.commonUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取当前时间
 */
public class DateUtil {

	public static String getCurrentDate(){
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(date.getTime());
	}
}
