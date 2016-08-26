package com.pateo.cloud.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

/**
 * Date Utility Class used to convert Strings to Dates and Timestamps
 *
 */
public final class DateUtil {
	private final static String str = "yyyy-MM-dd HH:mm:ss";
	private final static String shortDateStr = "yyyy-MM-dd";
	public static void main(String[] args) throws ParseException {

		String date = "2016-07-20 21:36:54";
		String date2 = "2016-07-21 21:38:38";
		String caculateTime = caculateTime(dateStringToDate(date), dateStringToDate(date2));
		System.out.println(caculateTime);
		
	}

	public static Date dateStringNextDayDate(String date)throws ParseException{
		SimpleDateFormat sdf= new SimpleDateFormat(shortDateStr);
		Date dt2 = sdf.parse(date);
		long lTime = dt2.getTime()+ 86400000;
		return new Date(lTime);
	}
	/**
	 * 计算时长
	 * @return
	 * @throws ParseException 
	 */
 
	public static long dateStringToSecond(String date)throws ParseException{
		SimpleDateFormat sdf= new SimpleDateFormat(str);
		Date dt2 = sdf.parse(date);
		long lTime = dt2.getTime()/1000;
		return lTime;
	}
	public static String dateStringToDateString(Date date)throws ParseException{
		long time = date.getTime();
		return timeStampToDateString(time);
	}
	public static Date dateStringToDate(String date)throws ParseException{
		SimpleDateFormat sdf = null;
		if (StringUtils.isNotBlank(date)) {
			if (date.length()>10) {
				sdf = new SimpleDateFormat(str);
			}else {
				sdf = new SimpleDateFormat(shortDateStr);
			}	
			Date dt2 = sdf.parse(date);
			System.err.println(dt2.getTime());
			return dt2;
		}
		return null;
	}
	/**
	 * 计算时长
	 * @return
	 */
	public static String timeStampToDateString(String timeStamp){
		
		return null;
	}
	public static String timeStampToDateString(long timeStamp){
		
		SimpleDateFormat df = new SimpleDateFormat(str);     
		Timestamp now = new Timestamp(timeStamp); 
		String str = df.format(now);    
		return str;
	}
	public static String timeSecondToDateString(String timeSecond){
		
		return null;
	}
	public static String timeStamp(){
		return ((Long)System.currentTimeMillis()).toString();
	}
	public static String caculateTime(Date actStartTime, Date actEndTime) {
		if (actStartTime==null) {
			return null;
		}
		long end = 0;
		if (actEndTime==null) {
			end = System.currentTimeMillis();
		}else {
			end = actEndTime.getTime();
		}
		
		
		long start = actStartTime.getTime();
		actEndTime.getTime();
		long minutes = (end - start)/60000;
		System.err.println(minutes);
		long day = 0;
		long hour = 0;
		long min = 0;
		day = minutes/(60*24);
		hour = (minutes%(60*24))/60;
		min = (minutes%(60*24))%60;
		String str = "";
		if (day!=0) {
			str += day+"天"+hour+"小时"+min+"分钟";
		}else {
			if (hour != 0) {
				str += hour+"小时"+min+"分钟";
			}else {
				str += min +"分钟";
			}
		}
		return str;
	}
	
}
