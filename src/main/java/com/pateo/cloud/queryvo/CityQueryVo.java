package com.pateo.cloud.queryvo;

import java.io.Serializable;

public class CityQueryVo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 
	private String province;
	private String sum;
	
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getSum() {
		return sum;
	}
	public void setSum(String sum) {
		this.sum = sum;
	}
	 
}
