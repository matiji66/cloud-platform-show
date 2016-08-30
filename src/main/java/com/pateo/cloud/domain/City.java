package com.pateo.cloud.domain;

public class City {

	public City() {
		// TODO Auto-generated constructor stub
	}

	
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
	public City(String province, String city, String device, int value) {
		super();
		this.province = province;
		this.city = city;
		this.device = device;
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	 
	
}
