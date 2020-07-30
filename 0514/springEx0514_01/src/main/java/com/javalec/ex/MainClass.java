package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		Student student1 = ctx.getBean("student1", Student.class);
		student1.print();
		Student student2 = ctx.getBean("student2", Student.class);
		student2.print();

	}

}
