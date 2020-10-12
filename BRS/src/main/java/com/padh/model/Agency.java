package com.padh.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.padh.model.auditable.Auditable;

import lombok.Data;


@Data
@Entity
@Table(name = "agency")
public class Agency extends Auditable<String>{
	
	
	private String code;
	private String name;
	private String detail;
	private String owner;
	

	
}
