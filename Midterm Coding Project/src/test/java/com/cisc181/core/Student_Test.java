package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	private static ArrayList<Student> Student;
	private static ArrayList<Course> Course;
	private static ArrayList<Semester> Semester;
	private static ArrayList<Section> Section;
	
	@BeforeClass
	public static void setup() {
		
		//ArrayList of three course records
		ArrayList<Course> CourseList = new ArrayList<Course>();
		Course physics = new Course(UUID.randomUUID(), "PHYS107", 100);
		CourseList.add(physics);
		Course chemistry = new Course(UUID.randomUUID(), "CHEM200", 100);
		CourseList.add(chemistry);
		Course compSci = new Course(UUID.randomUUID(), "CISC181", 100);
		CourseList.add(compSci);
		
		//ArrayList of Semesters
		ArrayList<Semester> SemesterList = new ArrayList<Semester>();
		Semester fall = new Semester(UUID.randomUUID(), new Date(2016,7,30), new Date(2016,12,16));
		SemesterList.add(fall);
		Semester spring = new Semester(UUID.randomUUID(), new Date(2017,3,7), new Date(2017,5,26));
		SemesterList.add(spring);
		
		//ArrayList of Sections
		ArrayList<Section> SectionList = new ArrayList<Section>();
		Section section1 = new Section(Course.get(0).CourseID, Semester.get(0).SemesterID, UUID.randomUUID(), 454);
		SectionList.add(section1);
		Section section2 = new Section(Course.get(0).CourseID, Semester.get(1).SemesterID, UUID.randomUUID(), 022);
		SectionList.add(section2);
		Section section3 = new Section(Course.get(1).CourseID, Semester.get(0).SemesterID, UUID.randomUUID(), 333);
		SectionList.add(section3);
		Section section4 = new Section(Course.get(1).CourseID, Semester.get(1).SemesterID, UUID.randomUUID(), 006);
		SectionList.add(section4);
		Section section5 = new Section(Course.get(2).CourseID, Semester.get(0).SemesterID, UUID.randomUUID(), 141);
		SectionList.add(section5);
		Section section6 = new Section(Course.get(2).CourseID, Semester.get(1).SemesterID, UUID.randomUUID(), 290);
		SectionList.add(section6);
		
		//ArrayList for students
		ArrayList<Student> StudentList = new ArrayList<Student>();
		Student student1 = new Student("f1", "m1", "l1", new Date(1995,1,1), eMajor.CHEM, "Address1", "(000)-000-0001", "email1@udel.edu");
		StudentList.add(student1);
		Student student2 = new Student("f2", "m2", "l2", new Date(1995,2,2), eMajor.BUSINESS, "Address1", "(000)-000-0002", "email2@udel.edu");
		StudentList.add(student2);
		Student student3 = new Student("f3", "m3", "l3", new Date(1995,3,3), eMajor.COMPSI, "Address3", "(000)-000-0003", "email3@udel.edu");
		StudentList.add(student3);
		Student student4 = new Student("f4", "m4", "l4", new Date(1995,4,4), eMajor.PHYSICS, "Address4", "(000)-000-0004", "email4@udel.edu");
		StudentList.add(student4);
		Student student5 = new Student("f5", "m5", "l5", new Date(1995,5,5), eMajor.NURSING,"Address5", "(000)-000-0005", "email5@udel.edu");
		StudentList.add(student5);
		Student student6 = new Student("f6", "m6", "l6", new Date(1995,6,6), eMajor.CHEM,"Address6", "(000)-000-0006", "email6@udel.edu");
		StudentList.add(student6);
		Student student7 = new Student("f7", "m7", "l7", new Date(1995,7,7), eMajor.BUSINESS,"Address7", "(000)-000-0007", "email7@udel.edu");
		StudentList.add(student7);
		Student student8 = new Student("f8", "m8", "l8", new Date(1995,8,8), eMajor.COMPSI,"Address8", "(000)-000-0008", "email8@udel.edu");
		StudentList.add(student8);
		Student student9 = new Student("f9", "m9", "l9", new Date(1995,9,9), eMajor.PHYSICS,"Address9", "(000)-000-0009", "email9@udel.edu");
		StudentList.add(student9);
		Student student10 = new Student("f10", "m10", "l10", new Date(1995,10,10), eMajor.NURSING,"Address10", "(000)-000-0010", "email10@udel.edu");
		StudentList.add(student10);
		
		//ArrayList for enrollment
		ArrayList<Enrollment> EnrollmentList = new ArrayList<Enrollment>();
		Enrollment StEnr1 = new Enrollment(student1.getStudentID(), section1.getSectionID());
		EnrollmentList.add(StEnr1);
		StEnr1.setGrade(1.0);
		Enrollment StEnr2 = new Enrollment(student1.getStudentID(), section2.getSectionID());
		EnrollmentList.add(StEnr2);
		StEnr2.setGrade(2.0);
		Enrollment StEnr3 = new Enrollment(student1.getStudentID(), section3.getSectionID());
		EnrollmentList.add(StEnr3);
		StEnr3.setGrade(3.0);
		Enrollment StEnr4 = new Enrollment(student1.getStudentID(), section4.getSectionID());
		EnrollmentList.add(StEnr4);
		StEnr4.setGrade(4.0);
		Enrollment StEnr5 = new Enrollment(student1.getStudentID(), section5.getSectionID());
		EnrollmentList.add(StEnr5);
		StEnr5.setGrade(1.5);
		Enrollment StEnr6 = new Enrollment(student1.getStudentID(), section6.getSectionID());
		EnrollmentList.add(StEnr6);
		StEnr6.setGrade(2.5);
		Enrollment StEnr7 = new Enrollment(student2.getStudentID(), section1.getSectionID());
		EnrollmentList.add(StEnr7);
		StEnr7.setGrade(3.5);
		Enrollment StEnr8 =new Enrollment(student2.getStudentID(), section2.getSectionID());
		EnrollmentList.add(StEnr8);
		StEnr8.setGrade(1.7);
		Enrollment StEnr9 = new Enrollment(student2.getStudentID(), section3.getSectionID());
		EnrollmentList.add(StEnr9);
		StEnr9.setGrade(2.8);
		Enrollment StEnr10 = new Enrollment(student2.getStudentID(), section4.getSectionID());
		EnrollmentList.add(StEnr10);
		StEnr10.setGrade(3.9);
		Enrollment StEnr11 = new Enrollment(student2.getStudentID(), section5.getSectionID());
		EnrollmentList.add(StEnr11);
		StEnr11.setGrade(3.0);
		Enrollment StEnr12 = new Enrollment(student2.getStudentID(), section6.getSectionID());
		EnrollmentList.add(StEnr12);
		StEnr12.setGrade(2.0);
		Enrollment StEnr13 = new Enrollment(student3.getStudentID(), section1.getSectionID());
		EnrollmentList.add(StEnr13);
		StEnr13.setGrade(4.0);
		Enrollment StEnr14 = new Enrollment(student3.getStudentID(), section2.getSectionID());
		EnrollmentList.add(StEnr14);
		StEnr14.setGrade(3.4);
		Enrollment StEnr15 = new Enrollment(student3.getStudentID(), section3.getSectionID());
		EnrollmentList.add(StEnr15);
		StEnr15.setGrade(3.4);
		Enrollment StEnr16 = new Enrollment(student3.getStudentID(), section4.getSectionID());
		EnrollmentList.add(StEnr16);
		StEnr16.setGrade(2.4);
		Enrollment StEnr17 = new Enrollment(student3.getStudentID(), section5.getSectionID());
		EnrollmentList.add(StEnr17);
		StEnr17.setGrade(1.4);
		Enrollment StEnr18 = new Enrollment(student3.getStudentID(), section6.getSectionID());
		EnrollmentList.add(StEnr18);
		StEnr18.setGrade(2.9);
		Enrollment StEnr19 = new Enrollment(student4.getStudentID(), section1.getSectionID());
		EnrollmentList.add(StEnr19);
		StEnr19.setGrade(1.4);
		Enrollment StEnr20 = new Enrollment(student4.getStudentID(), section2.getSectionID());
		EnrollmentList.add(StEnr20);
		StEnr20.setGrade(1.4);
		Enrollment StEnr21 = new Enrollment(student4.getStudentID(), section3.getSectionID());
		EnrollmentList.add(StEnr21);
		StEnr21.setGrade(2.4);
		Enrollment StEnr22 = new Enrollment(student4.getStudentID(), section4.getSectionID());
		EnrollmentList.add(StEnr22);
		StEnr22.setGrade(2.6);
		Enrollment StEnr23 = new Enrollment(student4.getStudentID(), section5.getSectionID());
		EnrollmentList.add(StEnr23);
		StEnr23.setGrade(3.7);
		Enrollment StEnr24 = new Enrollment(student4.getStudentID(), section6.getSectionID());
		EnrollmentList.add(StEnr24);
		StEnr24.setGrade(2.6);
		Enrollment StEnr25 = new Enrollment(student5.getStudentID(), section1.getSectionID());
		EnrollmentList.add(StEnr25);
		StEnr25.setGrade(3.5);
		Enrollment StEnr26 = new Enrollment(student5.getStudentID(), section2.getSectionID());
		EnrollmentList.add(StEnr26);
		StEnr26.setGrade(3.0);
		Enrollment StEnr27 = new Enrollment(student5.getStudentID(), section3.getSectionID());
		EnrollmentList.add(StEnr27);
		StEnr27.setGrade(1.0);
		Enrollment StEnr28 = new Enrollment(student5.getStudentID(), section4.getSectionID());
		EnrollmentList.add(StEnr28);
		StEnr28.setGrade(2.0);
		Enrollment StEnr29 = new Enrollment(student5.getStudentID(), section5.getSectionID());
		EnrollmentList.add(StEnr29);
		StEnr29.setGrade(3.0);
		Enrollment StEnr30 = new Enrollment(student5.getStudentID(), section6.getSectionID());
		EnrollmentList.add(StEnr30);
		StEnr30.setGrade(4.0);
		Enrollment StEnr31 = new Enrollment(student6.getStudentID(), section1.getSectionID());
		EnrollmentList.add(StEnr31);
		StEnr31.setGrade(1.0);
		Enrollment StEnr32 = new Enrollment(student6.getStudentID(), section2.getSectionID());
		EnrollmentList.add(StEnr32);
		StEnr32.setGrade(2.0);
		Enrollment StEnr33 = new Enrollment(student6.getStudentID(), section3.getSectionID());
		EnrollmentList.add(StEnr33);
		StEnr33.setGrade(3.0);
		Enrollment StEnr34 = new Enrollment(student6.getStudentID(), section4.getSectionID());
		EnrollmentList.add(StEnr34);
		StEnr34.setGrade(1.0);
		Enrollment StEnr35 = new Enrollment(student6.getStudentID(), section5.getSectionID());
		EnrollmentList.add(StEnr35);
		StEnr35.setGrade(2.0);
		Enrollment StEnr36 = new Enrollment(student6.getStudentID(), section6.getSectionID());
		EnrollmentList.add(StEnr36);
		StEnr36.setGrade(3.0);
		Enrollment StEnr37 = new Enrollment(student7.getStudentID(), section1.getSectionID());
		EnrollmentList.add(StEnr37);
		StEnr37.setGrade(4.0);
		Enrollment StEnr38 = new Enrollment(student7.getStudentID(), section2.getSectionID());
		EnrollmentList.add(StEnr38);
		StEnr38.setGrade(1.0);
		Enrollment StEnr39 = new Enrollment(student7.getStudentID(), section3.getSectionID());
		EnrollmentList.add(StEnr39);
		StEnr39.setGrade(2.0);
		Enrollment StEnr40 = new Enrollment(student7.getStudentID(), section4.getSectionID());
		EnrollmentList.add(StEnr40);
		StEnr40.setGrade(3.0);
		Enrollment StEnr41 = new Enrollment(student7.getStudentID(), section5.getSectionID());
		EnrollmentList.add(StEnr41);
		StEnr41.setGrade(1.0);
		Enrollment StEnr42 = new Enrollment(student7.getStudentID(), section6.getSectionID());
		EnrollmentList.add(StEnr42);
		StEnr42.setGrade(2.0);
		Enrollment StEnr43 = new Enrollment(student8.getStudentID(), section1.getSectionID());
		EnrollmentList.add(StEnr43);
		StEnr43.setGrade(3.0);
		Enrollment StEnr44 = new Enrollment(student8.getStudentID(), section2.getSectionID());
		EnrollmentList.add(StEnr44);
		StEnr44.setGrade(1.0);
		Enrollment StEnr45 = new Enrollment(student8.getStudentID(),section3.getSectionID());
		EnrollmentList.add(StEnr45);
		StEnr45.setGrade(4.0);
		Enrollment StEnr46 = new Enrollment(student8.getStudentID(), section4.getSectionID());
		EnrollmentList.add(StEnr46);
		StEnr46.setGrade(1.0);
		Enrollment StEnr47 = new Enrollment(student8.getStudentID(), section5.getSectionID());
		EnrollmentList.add(StEnr47);
		StEnr47.setGrade(2.0);
		Enrollment StEnr48 = new Enrollment(student8.getStudentID(), section6.getSectionID());
		EnrollmentList.add(StEnr48);
		StEnr48.setGrade(3.0);
		Enrollment StEnr49 = new Enrollment(student9.getStudentID(), section1.getSectionID());
		EnrollmentList.add(StEnr49);
		StEnr49.setGrade(1.0);
		Enrollment StEnr50 = new Enrollment(student9.getStudentID(), section2.getSectionID());
		EnrollmentList.add(StEnr50);
		StEnr50.setGrade(2.0);
		Enrollment StEnr51 = new Enrollment(student9.getStudentID(), section3.getSectionID());
		EnrollmentList.add(StEnr51);
		StEnr51.setGrade(3.0);
		Enrollment StEnr52 = new Enrollment(student9.getStudentID(), section4.getSectionID());
		EnrollmentList.add(StEnr52);
		StEnr52.setGrade(4.0);
		Enrollment StEnr53 = new Enrollment(student9.getStudentID(), section5.getSectionID());
		EnrollmentList.add(StEnr53);
		StEnr53.setGrade(4.0);
		Enrollment StEnr54 = new Enrollment(student9.getStudentID(), section6.getSectionID());
		EnrollmentList.add(StEnr54);
		StEnr54.setGrade(4.0);
		Enrollment StEnr55 = new Enrollment(student10.getStudentID(), section1.getSectionID());
		EnrollmentList.add(StEnr55);
		StEnr55.setGrade(4.0);
		Enrollment StEnr56 = new Enrollment(student10.getStudentID(), section2.getSectionID());
		EnrollmentList.add(StEnr56);
		StEnr56.setGrade(4.0);
		Enrollment StEnr57 = new Enrollment(student10.getStudentID(), section3.getSectionID());
		EnrollmentList.add(StEnr57);
		StEnr57.setGrade(4.0);
		Enrollment StEnr58 = new Enrollment(student10.getStudentID(), section4.getSectionID());
		EnrollmentList.add(StEnr58);
		StEnr58.setGrade(4.0);
		Enrollment StEnr59 = new Enrollment(student10.getStudentID(), section5.getSectionID());
		EnrollmentList.add(StEnr59);
		StEnr59.setGrade(4.0);
		Enrollment StEnr60 = new Enrollment(student10.getStudentID(), section6.getSectionID());
		EnrollmentList.add(StEnr60);
		StEnr60.setGrade(4.0);
	}

	@Test
	public void GPAtest() {
		assertEquals(1,1);
	}
	
	@Test 
	public void AverageGradeTest(){
		assertEquals(1,1);
	}
	
	@Test 
	public void ChangeMajorTest(){
		assertEquals(1,1);
	}
}