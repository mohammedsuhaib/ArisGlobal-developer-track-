package com.ticket.railway.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trains")
public class trains {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="train_no")
	private long train_no;
	
	@Column
	private String train_name;
	@Column
	private String source;
	
	@Column
	private String destination;
	
	@Column
	private Integer ticket_price;
	

	public long getTrain_no() {
		return train_no;
	}

	public void setTrain_no(long train_no) {
		this.train_no = train_no;
	}

	public String getTrain_name() {
		return train_name;
	}

	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Integer getTicket_price() {
		return ticket_price;
	}

	public void setTicket_price(Integer ticket_price) {
		this.ticket_price = ticket_price;
	}

	public trains(long train_no, String train_name, String source, String destination, Integer ticket_price) {
		
		this.train_no = train_no;
		this.train_name = train_name;
		this.source = source;
		this.destination = destination;
		this.ticket_price = ticket_price;
	}

	public trains() {
		
	}
	@Override
	public String toString() {
		return "trains [train_no=" + train_no + ", train_name=" + train_name + ", source=" + source + ", destination="
				+ destination + ", ticket_price=" + ticket_price + "]";
	}
	
}
