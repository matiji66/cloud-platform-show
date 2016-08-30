package com.pateo.cloud.dto;

//"province"	"city"	"device"	"value"
//"北京"			"北京"	"obd"		"87"

public class CityDto {

	private String province;
	private String city;
	private String device;
	private int value;
	
	
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	 
 
	  
}
