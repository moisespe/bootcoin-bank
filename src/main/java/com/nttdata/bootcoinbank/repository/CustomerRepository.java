package com.nttdata.bootcoinbank.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.nttdata.bootcoinbank.model.Customer;

import reactor.core.publisher.Mono;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
	Mono<Customer> findByUd(String id);
}
