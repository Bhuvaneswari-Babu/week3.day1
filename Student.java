package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student name:Bhuvana");
	}
	public void studentDept() {
		System.out.println("Student department:Electronics and communication engineering");
	}
	public void studentId() {
		System.out.println("Student id:0518");
	}
	public static void main(String[] args) {
		Student newStudent=new Student();
		newStudent.collegeName();
		newStudent.collgeCode();
		newStudent.collegeRank();
		newStudent.deptName();
		newStudent.studentName();
		newStudent.studentDept();
		newStudent.studentId();
		
	}
}
