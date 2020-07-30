package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCTX {

	@Bean
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("웹툰");
		hobbys.add("게임");
		hobbys.add("독서");

		Student student1 = new Student("홍길동", 30, hobbys);
		student1.setHeight(180);
		student1.setWeight(70);

		return student1;

	}
}
