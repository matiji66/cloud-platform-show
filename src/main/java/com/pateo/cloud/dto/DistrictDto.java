package com.pateo.cloud.dto;


public class DistrictDto {

	private int id;
	private String name;
	private int level;
	private int upperId;
	private String fullName;
	private String fullNamePin;
	private String briefNamePin;
	private boolean hotFlag;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getUpperId() {
		return upperId;
	}
	public void setUpperId(int upperId) {
		this.upperId = upperId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	public String getBriefNamePin() {
		return briefNamePin;
	}
	
	public void setBriefNamePin(String briefNamePin) {
		this.briefNamePin = briefNamePin;
	}
	public String getFullNamePin() {
		return fullNamePin;
	}
	public void setFullNamePin(String fullNamePin) {
		this.fullNamePin = fullNamePin;
	}
	public boolean isHotFlag() {
		return hotFlag;
	}
	public void setHotFlag(boolean hotFlag) {
		this.hotFlag = hotFlag;
	}


}
