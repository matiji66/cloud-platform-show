package com.pateo.cloud.domain;

import javax.persistence.Column;
import javax.persistence.Id;

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
	@Override
	public String toString() {
		return "ProvinceAndSum [province=" + province + ", sum=" + sum + "]";
	}
	@Id
	@Column(name = "province")
	private String  province ;
	@Column(name = "sum")
	private int sum ;

}
