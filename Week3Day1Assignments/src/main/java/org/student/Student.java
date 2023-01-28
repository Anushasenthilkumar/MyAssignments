package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Student Name : Anusha");
	}
	
	public void studentDept() {
		this.deptName();
	}
	
	public void studentId() {
		System.out.println("17102304567");
	}

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.studentName();
		s1.studentId();
		s1.studentDept();
		s1.collegeName();
		s1.collegeCode();
		s1.collegeName();
		

	}

}
