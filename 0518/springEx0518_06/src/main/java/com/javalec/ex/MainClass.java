package com.javalec.ex;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String config = "";
		System.out.println("서버를 선택해주세오");
		System.out.println("1)test-server  2)실제-server");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		switch (num) {

		case 1:
			config = "test";
			break;

		case 2:
			config = "server";
			break;
		default:
			break;
		}

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

		// config 의 값과 같은 profile의 내용을 읽어오겟다는뜻
		ctx.getEnvironment().setActiveProfiles(config);
		// 들고오기는 2개다 가져와야함
		ctx.load("appCTX1.xml", "appCTX2.xml");
		ctx.refresh();

		ServerInfo serverInfo = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println("서버접속완료");
		System.out.println("IpNum: " + serverInfo.getIpNum());
		System.out.println("PortNum: " + serverInfo.getPortNum());
		System.out.println("url: " + serverInfo.getIpNum() + serverInfo.getPortNum());

		ctx.close();
	}

}
