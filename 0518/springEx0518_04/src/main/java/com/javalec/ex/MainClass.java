package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCTX.class);
		ServerInfo serverInfo = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println(serverInfo.getAuth());
		System.out.println(serverInfo.getDriverClassName());

		ctx.close();
	}
}
