package com.javalec.ex;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String config = "";
		System.out.println("접속환경을 선택하세오");
		System.out.println("1)window 2)tablet 3)mobile");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		switch (num) {
		case 1:
			config = "window";
			break;
		case 2:
			config = "tablet";
			break;
		case 3:
			config = "mobile";
			break;
		default:
			break;

		}

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("appCTX1.xml", "appCTX2.xml", "appCTX3.xml");
		ctx.refresh();

		ServerInfo serverInfo = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println("브라우저: " + serverInfo.getBrowser());
		System.out.println("접속ip: " + serverInfo.getIpNum());
		System.out.println("" + serverInfo.getStatement());

	}

}
