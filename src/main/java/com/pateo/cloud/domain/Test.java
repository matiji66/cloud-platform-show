package com.pateo.cloud.domain;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name="test")
public class Test  {
 
	
	@Id
	@Column(name = "aaaa")
	private int name;
	@Column(name = "bbbb")
	private int level;
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "Test [name=" + name + ", level=" + level + ", getName()="
				+ getName() + ", getLevel()=" + getLevel() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
 

}
