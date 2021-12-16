package com.ticket.railway.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.railway.model.passenger;
import com.ticket.railway.model.trains;
import com.ticket.railway.repo.trainRepository;
import com.ticket.railway.service.ticketService;
import com.ticket.railway.service.impl.ticket;
import com.ticket.railway.util.UserData;

@RestController
public class mainController {

	@Autowired
	private ticketService ticketservice;
	
	@RequestMapping("/")
	public String hello() {
		return "hELLO wORLD";
	}
	
	@PostMapping("/api")
	public String create(@RequestBody UserData userdata) throws IOException {
		return ticketservice.generatePNR(userdata);
	}

	public mainController(ticketService ticketservice) {
		super();
		this.ticketservice = ticketservice;
	}	
}