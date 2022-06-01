package com.nttdata.bootcoinbank.repository;

import javax.management.Notification;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Notification, String>{

}
