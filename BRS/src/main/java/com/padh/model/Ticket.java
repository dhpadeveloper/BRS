package com.padh.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.padh.model.auditable.Auditable;

import lombok.Data;

@Data
@Entity
@Table(name = "ticket_detail")
public class Ticket extends Auditable<String>{

	private int seatNumber;
	private boolean cancellabel;
	private Date journeyDate;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "schedule_id")
	private TripSchedule ticketSchedule;
	
}
