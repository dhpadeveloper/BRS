package com.padh.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.padh.model.auditable.Auditable;

import lombok.Data;


@Data
@Entity
@Table(name = "stop")
public class Stop extends Auditable<String> {
	
	
	private String name;
	private String detail;
	private String code;	

	
	
	
}
