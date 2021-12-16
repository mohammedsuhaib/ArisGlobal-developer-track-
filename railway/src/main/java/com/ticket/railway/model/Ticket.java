package com.ticket.railway.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;


@Entity
@Table(name="Ticket")
public class Ticket {
	public Ticket() {
		
	}

	public Ticket(long ticketId, String pNR, Date travelDate, List<passenger> passenger, trains train) {
		
		this.ticketId = ticketId;
		PNR = pNR;
		this.travelDate = travelDate;
		Passenger = passenger;
		this.train = train;
	}

	public long getTicketId() {
		return ticketId;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", PNR=" + PNR + ", travelDate=" + travelDate + ", Passenger="
				+ Passenger + ", train=" + train + "]";
	}

	public void setTicketId(long ticketId) {
		this.ticketId = ticketId;
	}

	public String getPNR() {
		return PNR;
	}

	public void setPNR(String pNR) {
		PNR = pNR;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public List<passenger> getPassenger() {
		return Passenger;
	}

	public void setPassenger(List<passenger> passenger) {
		Passenger = passenger;
	}

	public trains getTrain() {
		return train;
	}

	public void setTrain(trains train) {
		this.train = train;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column()
	private long ticketId;
	
	@Column(name="pnr")
	private String PNR;
	
	@Column(name="travelDate")
	private Date travelDate;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Ticket_Passenger", joinColumns = { @JoinColumn(name = "ticketId") }, inverseJoinColumns = { @JoinColumn(name = "pid") })
	private List<passenger> Passenger;
		
	@OneToOne(cascade = {CascadeType.ALL})
    private trains train;
}
