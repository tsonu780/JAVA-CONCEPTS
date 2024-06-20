package com.practice.loanApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Customer")
@Data
@ToString
@NoArgsConstructor
public class Customer {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="Name", nullable = false)
	private String name;
	
	@Column(name = "Mobile_Number", unique = true, nullable = false)
	private String mobileNumber;
	
	@Column(name="Age", nullable=false)
	private int age;
	
	public long getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	public String getmobileNumber() {
		return this.mobileNumber;
	}
	public int getAge() {
		return this.age;
	}
	
	Customer(){
		
	}
	
	Customer(String name, String mobileNumber, int age){
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.age = age;
	}
	
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
	
}
