package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		// 기존방법
//		AbstractApplicationContext ctx=new GenericXmlApplicationContext("classpath:appCTX.xml");

		// 자바로 빈을 만들었을 때 사용하는 방법
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println("학생이름:" + student1.getName());
		System.out.println("학생나이:" + student1.getAge());
		System.out.println("학생취미:" + student1.getHobbys());
		System.out.println("키:" + student1.getWeight());
		System.out.println("몸무게:" + student1.getHeight());
	}
}
