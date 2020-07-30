package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("appCTX.xml");
		ctx.refresh();

		SubwayInfo subwayInfo = ctx.getBean("subwayInfo", SubwayInfo.class);
		System.out.println("Line: " + subwayInfo.getLine());
		System.out.println("Statn_nm: " + subwayInfo.getStatn_nm());
		System.out.println("Adres: " + subwayInfo.getAdres());
		System.out.println("Rdnmadr: " + subwayInfo.getRdnmadr());
		System.out.println("Telno: " + subwayInfo.getTelno());

		ctx.close();
	}
}
