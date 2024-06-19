package com.practice.loanApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Customer")
@Data
@NoArgsConstructor
public class Customer {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="Name", nullable = false)
	private String name;
	
	@Column(name = "Mobile_Number", unique = true, nullable = false)
	private int mobileNumber;
	
	@Column(name="Age", nullable=false)
	private int age;
	
	Customer(String name, int mobileNumber, int age){
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.age = age;
	}
}
