package com.padh.model;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.padh.model.auditable.Auditable;

import lombok.Data;

@Data
@Entity
@Table(name = "bus")
public class Bus extends Auditable<String> {
	
	private String code;
	private String make;
	private int capacity ;
	
	

}
