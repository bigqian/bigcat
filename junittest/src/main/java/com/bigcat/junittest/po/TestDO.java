package com.bigcat.junittest.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Test")
public class TestDO {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "ID")
	private Long id;

	@Column(name = "M", length = 255, nullable = false)
	private String m;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getM() {
		return m;
	}

	public void setM(String m) {
		this.m = m;
	}
}
