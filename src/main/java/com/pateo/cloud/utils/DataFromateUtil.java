package com.pateo.cloud.utils;

import java.text.DecimalFormat;

public class DataFromateUtil {

	public static double formate(double data){
		
		DecimalFormat dFormat = new DecimalFormat(".##");
		String format = dFormat.format(data);
		
		return Double.parseDouble(format);
	}
}
