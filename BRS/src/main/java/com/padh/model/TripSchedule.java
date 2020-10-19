package com.padh.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.padh.model.auditable.Auditable;

import lombok.Data;

@Data
@Entity
@Table(name = "ticket_schedule")
public class TripSchedule extends Auditable<String> {

	
	private Date tripDate;
	private int availableSeats;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "trip_id",unique = true)
	private Trip tripDetail;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "ticketSchedule")
	private Set<Ticket> ticketSold;
	
}
