package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;

	private Enrollment(){
	}

	public Enrollment(UUID StudentID, UUID SectionID){
		this.SectionID = SectionID;
		this.StudentID = StudentID;
		this.EnrollmentID = EnrollmentID;
	}

	//Defined as a procedure because it doesn't have a return type
	public void setGrade(double grade) {
		Grade = grade;
	}
	
}
