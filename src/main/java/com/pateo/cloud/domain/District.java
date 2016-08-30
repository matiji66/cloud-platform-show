package com.pateo.cloud.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="output_province_city")
public class District implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "DNAME")
	private String name;
	@Column(name = "DLEVEL")
	private int level;
	@Column(name = "UPPER_ID")
	private int upperId;
	@Column(name = "FULL_NAME")
	private String fullName;
	@Column(name = "PIN_NAME")
	private String pinName;
	@Column(name = "BRIEF_PIN")
	private String briefPinName;
	@Column(name = "ORDER_NO")
	private int orderNo;
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
	public String getPinName() {
		return pinName;
	}
	public void setPinName(String pinName) {
		this.pinName = pinName;
	}
	public String getBriefPinName() {
		return briefPinName;
	}
	public void setBriefPinName(String briefPinName) {
		this.briefPinName = briefPinName;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

}
