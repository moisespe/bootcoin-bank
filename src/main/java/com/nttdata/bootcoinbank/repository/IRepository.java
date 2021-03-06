package com.nttdata.bootcoinbank.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.nttdata.bootcoinbank.model.Customer;

public interface IRepository extends ReactiveMongoRepository<Customer, String>{

}
