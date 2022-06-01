package com.nttdata.bootcoinbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.bootcoinbank.model.Customer;
import com.nttdata.bootcoinbank.repository.CustomerRepository;
import com.nttdata.bootcoinbank.repository.ICustomerService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerService implements ICustomerService{

	@Autowired
	private CustomerRepository repository;
	
	@Override
	public Flux<Customer> findAll() {
		return repository.findAll();
	}

	@Override
	public Mono<Customer> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Mono<Customer> save(Customer customer) {
		return repository.save(customer);
	}

	@Override
	public Mono<Void> delete(Customer customer) {
		return repository.delete(customer);
	}


}
