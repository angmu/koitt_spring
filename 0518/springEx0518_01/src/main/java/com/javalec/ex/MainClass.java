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
			// propertySource의 젤 끝에 새로운 환경파일을 삽입.
			propertySource.addLast(new ResourcePropertySource("classpath:admin_properties"));
//			System.out.println(env.getProperty("admin.id"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext) ctx;
		ctx2.load("classpath:appCTX.xml"); // "appCTX.xml" 이거만 써도된다.
		ctx2.refresh();// admin.id,admin.pw의 값을 env에서 가져와서 값을 주입.

		AdminConnection adminConnection = ctx2.getBean("adminConnection", AdminConnection.class);

		System.out.println("adminId: " + adminConnection.getAdmin_id());
		System.out.println("adminPw: " + adminConnection.getAdmin_pw());

		ctx2.close();
		ctx.close();
	}

}
