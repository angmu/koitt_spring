package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		NoticeBoard noticeBoard = ctx.getBean("noticeBoard", NoticeBoard.class);
		noticeBoard.noticePrint();

		EventBoard eventBoard = ctx.getBean("eventBoard", EventBoard.class);
		eventBoard.eventPrint();

		Join join = ctx.getBean("join", Join.class);
		join.joinPrint();

		ctx.close();

	}

}
