package com.pateo.cloud.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
//@Table(name="cs_district")
@Table(name="Province")
public class Province  implements Serializable {

 
	private static final long serialVersionUID = 1L;
	public Province() {
	}

	public Province(int id,String name) {
		this.id =id;
		this.name = name;
	}
	
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	  
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

	@Override
	public String toString() {
		return "Province [id=" + id + ", name=" + name + "]";
	}
	
	
}
