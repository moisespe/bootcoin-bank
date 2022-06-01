package com.nttdata.bootcoinbank.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("BootCoin")
public class BootCoin {

	@Id
	private String id;
	
	@Field("customer")
	private Customer customer;
	
	@Field("balance")
	private Integer amountCoin;
	
	@Field("openBootcoin")
	private LocalDateTime openBootcoin = LocalDateTime.now();
	
}
