package com.javalec.ex;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		Temperature temper = ctx.getBean("temperature", Temperature.class);
		System.out.println(temper.nav + "의 온도");
		temper.trans_temp();

		Scanner scan = new Scanner(System.in);
		System.out.println("온도를 입력하세오");
		Double a = scan.nextDouble();
		temper.setTemp(a);
		temper.trans_temp();
	}
}
