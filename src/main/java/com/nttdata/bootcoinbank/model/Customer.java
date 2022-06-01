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
@Document("Customer")
public class Customer {
	
	@Id
	private String id;

	@Field("nameCustomer")
	private String nameCustomer;
	
	@Field("typeCustomer")
	private String typeCustomer;
	
	@Field("openDate")
	private LocalDateTime openDate = LocalDateTime.now();
	
}
