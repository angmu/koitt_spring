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
			propertySource.addLast(new ResourcePropertySource("classpath:admin"));
//			System.out.println(env.getProperty("admin.id"));
//			System.out.println(env.getProperty("admin.pw"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext) ctx;
		ctx2.load("classpath:appCTX.xml");
		ctx2.refresh();// adminconnection의 init실행.>>id,pw 값 할당
		AdminConnection adminConnection = ctx2.getBean("adminConnection", AdminConnection.class);
		System.out.println("id:" + adminConnection.getAdmin_id());
		System.out.println("pw:" + adminConnection.getAdmin_pw());

		ctx2.close();
	}

}
