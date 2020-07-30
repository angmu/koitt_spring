package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");

		// student> ArrayList(Student)
		StuInfo stuInfo = ctx.getBean("stuInfo", StuInfo.class);
		ArrayList<Student> list = stuInfo.getList();
		StuScore stuScore = ctx.getBean("stuScore3", StuScore.class);

		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			if (stu.stu_num == stuScore.stu_num) {
				System.out.println(stu.name + "학생의 정보출력");
				System.out.print(
						stu.stu_num + "\t" + stu.name + "\t" + stu.major + "\t" + stu.address + "\t" + stu.tel + "\t");
				System.out.print(stuScore.kor + "\t" + stuScore.eng + "\t" + stuScore.math + "\t" + stuScore.total
						+ "\t" + stuScore.avg + "\t");
				System.out.println();
			}
		}
	}
}
