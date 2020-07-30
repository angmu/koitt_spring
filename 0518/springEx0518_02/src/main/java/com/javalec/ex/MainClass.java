package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// env로 값을 주입하지않아도됨. Config ,mutable 을 안써도됨/
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("appCTX.xml");
		ctx.refresh();

		AdminConnection adminConnection = ctx.getBean("adminConnection", AdminConnection.class);
		System.out.println("admin_id:" + adminConnection.getAdmin_id());
		System.out.println("admin_pw:" + adminConnection.getAdmin_pw());
		System.out.println("sub_admin_id:" + adminConnection.getSub_admin_id());
		System.out.println("sub_admin_pw:" + adminConnection.getSub_admin_pw());

		ctx.close();
	}

}
