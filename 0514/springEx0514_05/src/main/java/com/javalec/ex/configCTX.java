package com.javalec.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configCTX {
	@Bean
	public Student student1() {

		Student student1 = new Student(1001, "홍길동", 85, 78, 62);

		return student1;
	}

	@Bean
	public Student student2() {

		Student student2 = new Student(1002, "김유신", 95, 87, 68);

		return student2;
	}
}
