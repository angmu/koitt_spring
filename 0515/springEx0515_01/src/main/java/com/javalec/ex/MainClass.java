package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 생명주기
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
//		ctx.load("destroy()");
		ctx.load("classpath:appCTX.xml");
		ctx.refresh();// initializingBean()
		Student student = ctx.getBean("student1", Student.class);
		System.out.println(student.getName());
		System.out.println(student.getAge());

		// 종료
		ctx.close();
	}

}
