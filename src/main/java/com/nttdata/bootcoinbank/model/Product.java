package com.nttdata.bootcoinbank.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product{

	
	@Id
	private String id;
	
	@Field("productName")
	private String productName;
	
	@Field("productType")
	private String productType;
	
	
	
}
