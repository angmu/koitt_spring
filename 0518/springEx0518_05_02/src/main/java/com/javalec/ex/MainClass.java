package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCTX.class);
		SubwayInfo subwayInfo = ctx.getBean("subwayInfo", SubwayInfo.class);
		System.out.println("Line: " + subwayInfo.getLine());
		System.out.println("subwayInfo: " + subwayInfo.getStatn_nm());
		System.out.println("Adres: " + subwayInfo.getAdres());
		System.out.println("Rdnmadr: " + subwayInfo.getRdnmadr());
		System.out.println("Telno: " + subwayInfo.getTelno());
		ctx.close();
	}

}
