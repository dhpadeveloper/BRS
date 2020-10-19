package com.padh.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "agency_id")
     private List<Bus> busList= new ArrayList<>(0);
	

	
}
