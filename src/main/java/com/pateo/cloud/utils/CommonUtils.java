package com.pateo.cloud.utils;

/**
 * Date Utility Class used to convert Strings to Dates and Timestamps
 *
 */
public final class CommonUtils {
	
	public static String getOrderNo(){
		Long currentTimeMillis = System.currentTimeMillis();
		return currentTimeMillis.toString();
	}
	public static String generateKey(){
		Long currentTimeMillis = System.currentTimeMillis();
		return currentTimeMillis.toString();
	}
}
