package com.javalec.ex;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AbstractApplicationContext ctx2=new GenericXmlApplicationContext();
//		Student stu=ctx2.getBean("",Student.class);

		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		// 외부파일을 들고오겠다는 선언
		ConfigurableEnvironment env = ctx.getEnvironment();
		// 사용할 프로퍼티 소스 (순서가 없음 add로 추가한다.-session처럼 이름으로 불러온다??)
		MutablePropertySources propertySource = env.getPropertySources();

		// 프로그램상 문제가 없는데 외부요소로인해 예상치못한 에러가 있을경우 뻑을 방지>> 외부파일가져올때 ,DB연결시 등
		try {
			propertySource.addLast(new ResourcePropertySource("classpath:admin.properties"));
			// 값이 잘 들어오는지 확인..
//			System.out.println(env.getProperty("admin.id"));
//			System.out.println(env.getProperty("admin.pw"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// env로 값세팅 완료 >>bean을 이제 가져와서 쓴다.
		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext) ctx;
		ctx2.load("classpath:appCTX.xml");
		ctx2.refresh();
		AdminConnection adminConnection = ctx2.getBean("adminConnection", AdminConnection.class);
		System.out.println(adminConnection.getAdminId());
		System.out.println(adminConnection.getAdminPw());

		ctx2.close();
	}

}
