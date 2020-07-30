package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		Stu_info stu_info = (Stu_info) ctx.getBean("stu_info");
		Stu_score score = (Stu_score) ctx.getBean("stu_score1");
		stu_info.getPrint(score);

		Stu_score score2 = (Stu_score) ctx.getBean("stu_score2");
		stu_info.getPrint(score2);

		Stu_score score3 = (Stu_score) ctx.getBean("stu_score3");
		stu_info.getPrint(score3);
	}
}
