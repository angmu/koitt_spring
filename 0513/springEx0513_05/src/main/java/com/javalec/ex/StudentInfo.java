package com.javalec.ex;

public class StudentInfo {
	Student student;

	public StudentInfo() {
	}

	// 생성자
	public StudentInfo(Student student) {
		this.student = student;
	}

	// setter로 값넣기
	public void setStudent(Student student) {
		this.student = student;
	}

	// 메소드
	public void getStudentInfo() {
		if (student != null) {
			System.out.println("학생이름:" + student.getName());
			System.out.println("학생나이:" + student.getAge());
			System.out.println("학년:" + student.getGradeNum());
			System.out.println("학반:" + student.getClassNum());
			System.out.println("------------------------------");
		}
	}

}
