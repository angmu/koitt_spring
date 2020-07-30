package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {
	// 스트링 빈의 경우>>
	// 1.appCTX.xml
	// 2.<bean id="student1" class="com.javalec.ex.Student">
	// 3. <construct-arg value="홍길동"/>

	@Bean
	public Student student1() {

		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("웹툰");
		hobbys.add("게임");
		hobbys.add("독서");
		Student student1 = new Student("홍길동", 30, hobbys);
		student1.setHeight(175);
		student1.setWeight(75);

		return student1;
	}

	@Bean
	public Student student2() {

		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("야구");
		hobbys.add("축구");
		Student student2 = new Student("김유신", 30, hobbys);
		student2.setHeight(187);
		student2.setWeight(58);

		return student2;
	}

}
