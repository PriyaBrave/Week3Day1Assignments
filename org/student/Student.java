package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName(String s) {
		System.out.println("Student Name: "+s);
	}
	
	public void studentDept(String sdept) {
		System.out.println("Student Dept: "+sdept);
	}
	
	public void studentId(int id) {
		System.out.println("Student ID: "+id);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.collegeCode(111);
		s.collegeRank(2);
		s.collegeName("University of Madras");
		s.deptName("Computer Science");
		s.studentId(1001);
		s.studentName("Priya");
		s.studentDept("Computer Application");
	}

}
