package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Thiru");
			}
	public void studentDept() {
		System.out.println("computer Application");
			}
	public void studentId() {
		System.out.println("6008");
			}


	public static void main(String[] args) {
	Student stud = new Student();
	stud.collegeName();
	stud.collegeCode();
	stud.collegeRank();
	stud.deptName();
	stud.studentId();
    stud.studentName();
    stud.studentDept();
    
	}

}
