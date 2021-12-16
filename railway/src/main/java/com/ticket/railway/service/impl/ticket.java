package com.ticket.railway.service.impl;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ticket.railway.model.Ticket;
import com.ticket.railway.model.passenger;
import com.ticket.railway.model.trains;
import com.ticket.railway.repo.PassengerRepository;
import com.ticket.railway.repo.TicketRepository;
import com.ticket.railway.repo.trainRepository;
import com.ticket.railway.service.ticketService;
import com.ticket.railway.util.UserData;

@Service
public class ticket implements ticketService{

	@Autowired
	private trainRepository trainrepository;
	@Autowired
	private PassengerRepository passengerRepository;
	@Autowired
	private TicketRepository ticketRepository;
	private trains train;
	
	//private Ticket ticket= new Ticket();
	private TreeMap <passenger,Double> passengers;
	
	 private int counter = 100;
	   	    
	 public double calcPassengerFare(passenger passenger,trains train)
	    {
	        if (passenger.getAge() <= 12)
	        {
	            return train.getTicket_price() * 0.5;
	        }
	        if (passenger.getAge() >= 60)
	        {
	            return train.getTicket_price() *0.6;
	        }
	        if (passenger.getGender() == 'F' || passenger.getGender() =='f')
	        {
	            return train.getTicket_price() * 0.75;
	        } else{
	            return train.getTicket_price();
	        }
	    }
	    
	    public void addPassenger(passenger pass){
	        passengers.put(pass,calcPassengerFare(pass,train));
	    }

	    public Double totalPrice(TreeMap<passenger,Double> passengers) {
	    	Double total=(double) 0;
	    	for(Map.Entry<passenger,Double> e :
             passengers.entrySet()) {
	    		total = total+e.getValue();
	    	}
	    		return total;
	    }
		@Override
		public String generatePNR(UserData userData) throws IOException {
			 train = trainrepository.findByTrainNumber(userData.getTrain_no());	
			 if(train==null) {
	        	return "Train with given train number does not exist";
	        }	
			 Date current_date = new Date();
			 if(userData.getTravel_date().before(current_date)) {
				 return "Travel Date is before current date";
			 }
			 SimpleDateFormat DateFor = new SimpleDateFormat("yyyyMMdd");
			   String date = DateFor.format(userData.getTravel_date());
		    String pnr =
		                Character.toString(train.getSource().charAt(0)) +
		                Character.toString(train.getDestination().charAt(0)) + "_" +
		                 date + "_" +
		                ++counter;
		     passengers  = new TreeMap<passenger,Double>() ; 
		     for(passenger p:userData.getPass()) {
		   	 addPassenger(p);
		   	 }
		     Ticket ticket= new Ticket();
		     ticket.setPassenger(userData.getPass());
		     ticket.setTravelDate(userData.getTravel_date());
		     ticket.setPNR(pnr);
		     ticket.setTrain(train);
		     ticketRepository.save(ticket);
		     
		     Double totalPrices = totalPrice(passengers);
		     System.out.println(passengers); 
		     System.out.println(totalPrices);
		     
		     
		     SimpleDateFormat DateforFile = new SimpleDateFormat("dd/MM/yyyy");
		     String Filedate = DateforFile.format(userData.getTravel_date());
		     Path p = Paths.get("C:\\javaClass\\"+pnr+".txt");
		        if (Files.exists(p)){
		            Files.delete(p);
		        }
		        p = Files.createFile(p);
		        Files.write(p,("PNR:          " + pnr + "\n").getBytes(),StandardOpenOption.APPEND);
		        Files.write(p,("Train NO:     " +train.getTrain_no() +"\n").getBytes(),StandardOpenOption.APPEND);
		        Files.write(p,("Train Name:   "  + train.getTrain_name().replace("\n", " ") + "\n").getBytes(),StandardOpenOption.APPEND);
		        Files.write(p,("From:         " + train.getSource() + "\n").getBytes(),StandardOpenOption.APPEND);
		        Files.write(p,("To:           " +train.getDestination() + "\n").getBytes(),StandardOpenOption.APPEND);
		        Files.write(p,("Travel Date:  " + Filedate + "\n").getBytes(),StandardOpenOption.APPEND);
		        Files.write(p,("\n").getBytes(),StandardOpenOption.APPEND);
		        Files.write(p,("Passengers:\n").getBytes(),StandardOpenOption.APPEND);
		        Files.write(p,("name"+"\t"+"age"+"\t"+"gender"+"\t"+"fare"+"\n").getBytes(),StandardOpenOption.APPEND);
		        for(Map.Entry<passenger,Double> e :
		             passengers.entrySet()) {
			    Files.write(p,(e.getKey().getName()+" "+e.getKey().getAge()+" "+e.getKey().getGender()+" "+e.getValue()+"\n").getBytes(),StandardOpenOption.APPEND);		
			    }
		        Files.write(p,("Total Price:"+totalPrices).getBytes(),StandardOpenOption.APPEND);
			   return "Ticket Booked with PNR :"+pnr;
		}	  
}
