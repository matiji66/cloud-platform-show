package com.pateo.cloud.common;

public class ResultData {

	private Object data;
	private String desc;
	private String code;

	public ResultData(Object data ,String code, String desc) {
		this.desc = desc;
		this.code = code;
		this.data = data;
	}
	public ResultData() {
		
	}
	public ResultData(String code, String desc) {
		this.desc = desc;
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

}
