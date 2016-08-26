package com.pateo.cloud.utils;

import java.util.HashMap;
import java.util.Map;

public class MapDistanceUtils {
	 private static double EARTH_RADIUS = 6378.137; 
	   
	    private static double rad(double d) { 
	        return d * Math.PI / 180.0; 
	    }
	     
	    /**
	     * 根据两个位置的经纬度，来计算两地的距离（单位为KM）
	     * 参数为String类型
	     * @param lat1 用户经度
	     * @param lng1 用户纬度
	     * @param lat2 商家经度
	     * @param lng2 商家纬度
	     * @return
	     */
	    public static String getDistance(String lat1Str, String lng1Str, String lat2Str, String lng2Str) {
	        Double lat1 = Double.parseDouble(lat1Str);
	        Double lng1 = Double.parseDouble(lng1Str);
	        Double lat2 = Double.parseDouble(lat2Str);
	        Double lng2 = Double.parseDouble(lng2Str);
	         
	        double radLat1 = rad(lat1);
	        double radLat2 = rad(lat2);
	        double difference = radLat1 - radLat2;
	        double mdifference = rad(lng1) - rad(lng2);
	        double distance = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(difference / 2), 2)
	                + Math.cos(radLat1) * Math.cos(radLat2)
	                * Math.pow(Math.sin(mdifference / 2), 2)));
	        distance = distance * EARTH_RADIUS;
	        distance = Math.round(distance * 10000) / 10000;
	        String distanceStr = distance+"";
	        distanceStr = distanceStr.
	            substring(0, distanceStr.indexOf("."));
	         
	        return distanceStr;
	    }
	     
	    /**
	     * 获取当前用户一定距离以内的经纬度值
	     * 单位米 return minLat
	     * 最小经度 minLng
	     * 最小纬度 maxLat
	     * 最大经度 maxLng
	     * 最大纬度 minLat
	     */
	    public static Map<String,Double> getAround(String latStr, String lngStr, double raidus) {
	        Double latitude = Double.parseDouble(latStr);// 传值给经度
	        Double longitude = Double.parseDouble(lngStr);// 传值给纬度
	        double raidusMile = raidus ;
	        return  getAround(latitude, longitude, raidusMile);
	         
	    }
	    public static Map<String,Double> getAround(double latStr, double lngStr, double raidus) {
	    	Map<String,Double> map = new HashMap<String,Double>();
	        Double latitude = latStr;// 传值给经度
	        Double longitude = lngStr;// 传值给纬度
	 
	        Double degree = (24901 * 1609) / 360.0; // 获取每度
	        double raidusMile = raidus;
	         
	        Double mpdLng = Double.parseDouble((degree * Math.cos(latitude * (Math.PI / 180))+"").replace("-", ""));
	        Double dpmLng = 1 / mpdLng;
	        Double radiusLng = dpmLng * raidusMile;
	        //获取最小经度
	        Double minLat = longitude - radiusLng;
	        // 获取最大经度
	        Double maxLat = longitude + radiusLng;
	        Double dpmLat = 1 / degree;
	        Double radiusLat = dpmLat * raidusMile;
	        // 获取最小纬度
	        Double minLng = latitude - radiusLat;
	        // 获取最大纬度
	        Double maxLng = latitude + radiusLat;
	         
	        map.put("minLat", minLat );
	        map.put("maxLat", maxLat );
	        map.put("minLng", minLng );
	        map.put("maxLng", maxLng );
	         
	        return map;
	    }
 
	     
	    public static void main(String[] args) {
	        //济南国际会展中心经纬度：117.11811  36.68484
	        //趵突泉：117.00999000000002  36.66123
	        System.out.println(getAround(117.11811, 36.68484, 10000));
//	        System.out.println(getAround("117.11811", "36.68484", "13000"));
	        System.err.println(getDistance(117.11811,36.68484,117.00999000000002,36.66123));

	    }
	    
	    public static double getDistance(double long1, double lat1, double long2, double lat2) {  
	        double a, b, R;  
	        R = 6378137; // 地球半径  
	        lat1 = lat1 * Math.PI / 180.0;  
	        lat2 = lat2 * Math.PI / 180.0;  
	        a = lat1 - lat2;  
	        b = (long1 - long2) * Math.PI / 180.0;  
	        double d;  
	        double sa2, sb2;  
	        sa2 = Math.sin(a / 2.0);  
	        sb2 = Math.sin(b / 2.0);  
	        d = 2  
	                * R  
	                * Math.asin(Math.sqrt(sa2 * sa2 + Math.cos(lat1)  
	                        * Math.cos(lat2) * sb2 * sb2));  
	        return d;  
	    }  
	    
		public static String getAddress(double d, double e) {
			 
			return "";
		}
}
