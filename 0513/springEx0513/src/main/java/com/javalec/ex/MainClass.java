package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String configLocation="classpath:applicationCTX.xml";
		AbstractApplicationContext ctx=new GenericXmlApplicationContext(configLocation);
		//혹은 아래처럼 1줄로 써도된다.
//		ApplicationContext ctx1=new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		MyCalculator myCalculator=ctx.getBean("myCalculator",MyCalculator.class);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.multi();
		myCalculator.div();
		
//		//기존구조
//		MyCalculator myCalculator=new MyCalculator();
//		myCalculator.setCalculator(new Calculator());
//		
//		myCalculator.setFirstNum(10);
//		myCalculator.setSecondNum(2);
//		
//		myCalculator.add();
//		myCalculator.sub();
//		myCalculator.multi();
//		myCalculator.div();
	}

}
