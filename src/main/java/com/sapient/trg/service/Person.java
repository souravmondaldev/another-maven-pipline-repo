package com.sapient.trg.service;

import java.time.LocalDate;

//POJO (Plain Old Java Object) class
public class Person {
	private Integer personId;
	private String firstName;
	private String lastName;
	private LocalDate birthdate;
	private Long mobile;
	
	//default(no-arg) constructor
	public Person() {
		
	}
	
	
	//All-arg constructor
	public Person(Integer personId, String firstName, String lastName, LocalDate birthdate, Long mobile) {
		super();
		if(firstName==null && lastName==null) {
			throw new IllegalArgumentException("Both first name and last name cannot be null");
		}
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.mobile = mobile;
	}
	
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
}