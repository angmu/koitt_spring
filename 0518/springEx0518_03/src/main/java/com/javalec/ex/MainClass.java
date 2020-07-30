package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("appCTX.xml");
		ctx.refresh();

		ServerConnection serverConnection = ctx.getBean("serverConnection", ServerConnection.class);
		System.out.println("auth: " + serverConnection.getAuth());
		System.out.println("driverClassName: " + serverConnection.getDriverClassName());
		System.out.println("url: " + serverConnection.getUrl());
		System.out.println("username: " + serverConnection.getUsername());
		System.out.println("password: " + serverConnection.getPassword());
		System.out.println("name: " + serverConnection.getName());
		System.out.println("type: " + serverConnection.getType());
		System.out.println("maxActive: " + serverConnection.getMaxActive());
		System.out.println("maxWait: " + serverConnection.getMaxWait());

		ctx.close();
	}

}
