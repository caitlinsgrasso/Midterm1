package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;
public class Staff_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@Test
	public void salaryTest() {
		ArrayList<Staff> staff = new ArrayList<Staff>();
		Staff person1 = new Staff("Kate", "Sally", "Smith", new Date(60,3,4), "1 Continental Rd.", "(335)-295-2956", "email1@udel.edu", "M 1", 10, 100000, new Date(91,1,1), eTitle.MS);
		staff.add(person1);
		Staff person2 = new Staff("Dan", "Jacob", "Johnson", new Date(62,2,2), "45 Old Orchard Ln.", "354-999-2862", "email2@udel.edu", "TR 2", 9, 200000, new Date(92,2,2), eTitle.MR);
		staff.add(person2);
		Staff person3 = new Staff("Jannett", "Jean", "Daniels", new Date(63,3,3), "55 Donald Ave.", "(296)-192-3567", "email3@udel.edu", "W 3", 8, 180000, new Date(93,3,3), eTitle.MRS);
		staff.add(person3);
		Staff person4 = new Staff("Gale", "Ann", "Lee", new Date(64,4,4), "9 Walnut Ave.", "(486)-777-2846", "email4@udel.edu", "TR 4", 7, 150000, new Date(94,4,4), eTitle.MS);
		staff.add(person4);
		Staff person5 = new Staff("Sam", "Albert", "Simmons", new Date(01,5,5), "38 Dean Blvd.", "(693)-294-3934", "email5@udel.edu", "F 5", 6, 250000, new Date(95,5,5), eTitle.MR);
		staff.add(person5);
		
		double average = (person1.getSalary()+person2.getSalary()+person3.getSalary()+person4.getSalary()+person5.getSalary())/5;
		
		assertEquals(average, 176000);
		
	}	
	
	@Test(expected = PersonException.class)
	public void phone_numberTest() throws PersonException {
		Staff incorrectNumber = new Staff("Dan", "Jacob", "Johnson", new Date(62,2,2), "45 Old Orchard Ln.", "354-999-2862", "email2@udel.edu", "TR 2", 9, 200000, new Date(92,2,2), eTitle.MR);
		
	}
	
	@Test(expected = PersonException.class)
	public void DOBTest() throws PersonException {
		Staff incorrectDOB = new Staff("Sam", "Albert", "Simmons", new Date(01,5,5), "38 Dean Blvd.", "(693)-294-3934", "email5@udel.edu", "F 5", 6, 250000, new Date(95,5,5), eTitle.MR);
	}

}
