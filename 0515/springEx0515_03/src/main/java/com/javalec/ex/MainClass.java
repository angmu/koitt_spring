package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:appCTX.xml");
		ctx.refresh();
		Student student1 = ctx.getBean("student", Student.class);
		Student student2 = ctx.getBean("student", Student.class);
		// student1과 student2는 같은 빈을 받아와서 같은 객체이다.(싱글톤패턴)
		System.out.println("1의 이름:" + student1.getName());
		System.out.println("1의 나이:" + student1.getAge());

		// student2의 값을 바꾸면 student1의 값도 바뀐다.
		student2.setName("김유신");
		student2.setAge(50);
		System.out.println("1의 이름:" + student1.getName());
		System.out.println("1의 나이:" + student1.getAge());

		if (student1.getName().equals(student2.getName())) {
			System.out.println("1과 2는 같은객체");
		} else {
			System.out.println("1과 2는 다른객체");
		}

		ctx.close();
	}
}
