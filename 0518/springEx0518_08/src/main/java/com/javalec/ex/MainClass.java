package com.javalec.ex;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config = "";

		System.out.println("서버타입을 고르시오 ");
		System.out.println("1)test 2)server");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		switch (num) {
		case 1:
			config = "test";
			break;
		case 2:
			config = "server";
			break;

		}

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		// 어노테이션에서는 load대신 아래꺼를 쓴다
		ctx.register(AppConfig1.class, AppConfig2.class);
		ctx.refresh();

		ServerInfo serverInfo = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println("IpNum: " + serverInfo.getIpNum());
		System.out.println("PortNum: " + serverInfo.getPortNum());
		ctx.close();

	}
}
