package com.nttdata.bootcoinbank.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.nttdata.bootcoinbank.model.BootCoin;

public interface IBootCoin extends ReactiveMongoRepository<BootCoin, String>{

}
