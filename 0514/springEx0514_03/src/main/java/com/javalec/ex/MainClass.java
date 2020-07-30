package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config1 = "classpath:appCTX.xml";
		String config2 = "classpath:appCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config1, config2);
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println("이름:" + student1.getName());
		System.out.println("취미:" + student1.getHobbys());
		System.out.println();

		StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
		Student student2 = studentInfo.getStudent();
		System.out.println("Info이름:" + student2.getName());
		System.out.println("Info취미:" + student2.getHobbys());
		System.out.println();
		if (student1.equals(student2)) {
			System.out.println("1과 2는 같은 객체입니다");
		} else {
			System.out.println("1과 2는 다른 객체입니다");
		}
		System.out.println();
		Student student3 = ctx.getBean("student3", Student.class);
		System.out.println("student3이름:" + student3.getName());
		System.out.println("student3취미:" + student3.getHobbys());
		System.out.println();
		if (student1.equals(student3)) {
			System.out.println("1과 3는 같은 객체입니다");
		} else {
			System.out.println("1과 3는 다른 객체입니다");
		}

		Family family = ctx.getBean("family", Family.class);
		System.out.println("아빠이름:" + family.getFatherName());
		System.out.println("엄마이름:" + family.getMotherName());
		System.out.println("언니이름:" + family.getSisterName());
		System.out.println("형이름:" + family.getBrotherName());

		ctx.close();
	}
}
