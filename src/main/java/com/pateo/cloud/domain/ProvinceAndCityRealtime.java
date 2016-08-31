package com.pateo.cloud.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;




@Entity
@Table(name="output_province_city_realtime")
public class ProvinceAndCityRealtime  {

//	"province"	"city"	"device"	"value"
//	"北京"	"北京"	"obd"	"87"

	@Column(name = "VALUE")
	private int value;
	@Column(name = "PROVINCE")
	private String province;
	@Id
	@Column(name = "CITY")
	private String city;
	@Column(name = "DEVICE")
	private String device;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
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
	@Override
	public String toString() {
		return "ProvinceAndCity [value=" + value + ", province=" + province + ", city=" + city + ", device=" + device
				+ "]";
	}
	 
	 
}
