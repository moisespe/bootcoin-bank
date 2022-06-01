package com.nttdata.bootcoinbank.model;

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
	
	@Field(name = "customerType")
	private String customerType;
	
	@Field(name = "name")
	private String name;
	
}
