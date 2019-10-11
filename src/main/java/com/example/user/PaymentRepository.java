package com.example.user;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface PaymentRepository extends Repository<Payment, Integer>{
	
	Payment delete(Payment payment);
	
	List<Payment> findAll();
	
	Payment findOne(int id);
	
	Payment save(Payment payment);

}
