package com.ticket.railway.util;

import java.util.Date;
import java.util.List;

import com.ticket.railway.model.passenger;

public class UserData {
	
	@Override
	public String toString() {
		return "UserData [train_no=" + train_no + ", travel_date=" + travel_date + ", pass=" + pass + "]";
	}
	private Long train_no;
	private Date travel_date;
	private List<passenger> pass;
	public Long getTrain_no() {
		return train_no;
	}
	public void setTrain_no(Long train_no) {
		this.train_no = train_no;
	}
	public Date getTravel_date() {
		return travel_date;
	}
	public void setTravel_date(Date travel_date) {
		this.travel_date = travel_date;
	}
	public List<passenger> getPass() {
		return pass;
	}
	public void setPass(List<passenger> pass) {
		this.pass = pass;
	}
	public UserData(Long train_no, Date travel_date, List<passenger> pass) {
		this.train_no = train_no;
		this.travel_date = travel_date;
		this.pass = pass;
	}
}
