package com.ticket.railway.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticket.railway.model.passenger;

@Repository
public interface PassengerRepository extends JpaRepository<passenger,Long>{

}
