package com.padh.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.padh.model.auditable.Auditable;

import lombok.Data;

@Data
@Entity
@Table(name = "trip")
public class Trip extends Auditable<String> {
	
	private BigDecimal fare ;
	private String journeyTime;

}
