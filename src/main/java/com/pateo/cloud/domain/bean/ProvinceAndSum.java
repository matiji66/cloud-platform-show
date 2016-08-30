package com.pateo.cloud.domain.bean;

public class ProvinceAndSum {

	public ProvinceAndSum() {
		// TODO Auto-generated constructor stub
	}
	
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public int getSum() {
		return sum;
	}
	public ProvinceAndSum(String province, int sum) {
		super();
		this.province = province;
		this.sum = sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	private String  province ;
	private int sum ;

}
