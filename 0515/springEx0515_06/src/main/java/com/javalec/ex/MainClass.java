package com.javalec.ex;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertySource = env.getPropertySources();

		try {
			propertySource.addLast(new ResourcePropertySource("classpath:server.properties"));
//			System.out.println(env.getProperty("auth"));
		} catch (Exception e) {
			// TODO: handle exception
		}

		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext) ctx;
		ctx2.load("appCTX.xml");
		ctx2.refresh();

		ServerConn serverConn = ctx2.getBean("serverConn", ServerConn.class);
		System.out.println("Auth: " + serverConn.getAuth());
		System.out.println("DriverClassName: " + serverConn.getDriverClassName());
		System.out.println("Url: " + serverConn.getUrl());
		System.out.println("Username: " + serverConn.getUsername());
		System.out.println("Password: " + serverConn.getPassword());
		System.out.println("Name: " + serverConn.getName());
		System.out.println("Type: " + serverConn.getType());
		System.out.println("MaxActive: " + serverConn.getMaxActive());
		System.out.println("MaxWait: " + serverConn.getMaxWait());
		ctx2.close();
		ctx.close();
	}

}
