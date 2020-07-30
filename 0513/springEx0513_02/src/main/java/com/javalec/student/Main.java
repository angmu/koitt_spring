package com.javalec.student;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx=new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Stu_score stu_score=ctx.getBean("stu_score",Stu_score.class);
		
		System.out.println("학번\t이름\t국어점수\t영어점수\t수학점수\t합계\t평균\t결과");
		System.out.println();
		System.out.print(stu_score.hak_num+"   ");
		System.out.print(stu_score.name+"   ");
		System.out.print(stu_score.kor+"   ");
		System.out.print(stu_score.eng+"   ");
		System.out.print(stu_score.math+"   ");
		System.out.print(stu_score.total+"   ");
		System.out.print(stu_score.avg+"   ");
		stu_score.stu_re();
		
	}

}
