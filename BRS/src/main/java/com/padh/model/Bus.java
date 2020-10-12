package com.padh.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.padh.model.auditable.Auditable;

import lombok.Data;

@Data
@Entity
@Table(name = "bus")
public class Bus extends Auditable<String> {
	
	private String code;
	private String make;
	private BigDecimal capacity ;
	
	

}
