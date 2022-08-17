package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)

@Entity
@Table(name="jasna1_transaction_log")
public class TransactionLog {

	@Id
	@SequenceGenerator(name = "jasnaSeq5", sequenceName = "sequence", initialValue = 101, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jasnaSeq5")
	@Column(name="transaction_id")
	int transactionId;
	
	@Column(name="user_login_id")
	int userLoginId;
	
	@Column(name="api_operation_name")
	String apiOperationName;
	
	@Column(name="request")
	String request;
	
	@Column(name="response")
	String response;
	
	@DateTimeFormat(iso=ISO.DATE)
	@Column(name="created_date")
	LocalDate createdDate;
	
	@DateTimeFormat(iso=ISO.TIME)
	@Column(name="created_time")
	LocalTime createdTime;
	
}
