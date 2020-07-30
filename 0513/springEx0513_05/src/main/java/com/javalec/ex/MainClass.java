package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
		// 생성자를 통한 데이터 주입
		studentInfo.getStudentInfo();

		// setter
		Student student = ctx.getBean("student2", Student.class);
		// 학생의 데이터 값을 다시 세팅
		studentInfo.setStudent(student);
		studentInfo.getStudentInfo();

		ctx.close();
	}

}
