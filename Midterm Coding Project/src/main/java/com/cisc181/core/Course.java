package com.cisc181.core;

import java.util.UUID;

public class Course {
	UUID CourseID;
	String CourseName;
	int GradePoints;
	
	public Course(UUID RandomUUID, String courseName, int gradePoints) {
		super();
		CourseID = RandomUUID;
		CourseName = courseName;
		GradePoints = gradePoints;
	}
	
}
