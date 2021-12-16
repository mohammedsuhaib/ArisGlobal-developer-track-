package com.ticket.railway.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ticket.railway.model.trains;

@Repository
public interface trainRepository extends JpaRepository<trains,Long> {

	@Query("SELECT t FROM trains t WHERE t.train_no = ?1")
	trains findByTrainNumber(Long train_no);
}
