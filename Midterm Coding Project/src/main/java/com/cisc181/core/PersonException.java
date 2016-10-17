package com.cisc181.core;

import java.util.Date;

public class PersonException extends Exception {
	private Person Person;
	private Date DOB;
	private String phone_number;
	
	public PersonException(){
	}
	
	public PersonException(Date DOB){
		this.DOB = DOB;
	}
	
	public PersonException(String phone_number){
		this.phone_number = phone_number;
	}
}
