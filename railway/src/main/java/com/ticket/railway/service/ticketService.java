package com.ticket.railway.service;



import java.io.IOException;
import java.util.Date;
import java.util.List;

import com.ticket.railway.model.passenger;
import com.ticket.railway.util.UserData;



public interface ticketService {
	//public String generatePNR();

	String generatePNR(UserData userdata) throws IOException;
}
