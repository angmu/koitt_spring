package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		Book book = ctx.getBean("book", Book.class);
		book.bookPrint();

		Rental rental = ctx.getBean("rental", Rental.class);
		rental.rentalPrint();

		ctx.close();
	}

}
