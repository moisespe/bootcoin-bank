package com.nttdata.bootcoinbank.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("transfer")
public class Transfers {
	
	@Id
	private String id;
	
	@Field("sellerTransfer")
	private BootCoin sellerTransfer;
	
	@Field("buyerTransfer")
	private BootCoin buyerTransfer;

	@Field("amountTransfer")
	private Double amount;
	
	@Field("amountCointTransfer")
	private Integer amountCointTransfer;
	
	@Field("statusTransfer")
	private String statusTransactionTransfer;
	
	@Field("verifyCodeTransfer")
	@Indexed(unique = true)
	private String verifyCodeTransfer;
	
	@Field("tranferDate")
	private LocalDateTime tranferDate = LocalDateTime.now();
}
