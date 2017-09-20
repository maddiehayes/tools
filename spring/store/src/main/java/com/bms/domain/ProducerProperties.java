package com.bms.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ProducerProperties {
	
	public ProducerProperties() {};
	
	public ProducerProperties(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String value;
	
	@JsonIgnore
	@ManyToOne
	private PerformanceRun performanceRun;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public PerformanceRun getPerformanceRun() {
		return performanceRun;
	}

	public void setPerformanceRun(PerformanceRun performanceRun) {
		this.performanceRun = performanceRun;
	}

}
