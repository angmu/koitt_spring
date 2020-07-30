package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:appCTX.xml");
		ctx.refresh();

		Member member = ctx.getBean("member1", Member.class);
		Medical_record medical_record1 = ctx.getBean("medical_record1", Medical_record.class);
		Medical_record medical_record2 = ctx.getBean("medical_record2", Medical_record.class);
		ArrayList<Medical_record> list = new ArrayList<Medical_record>();
		list.add(medical_record1);
		list.add(medical_record2);

		for (int i = 0; i < list.size(); i++) {
			Medical_record medical_record = list.get(i);
			if (member.getMemberNum() == medical_record.getMemberNum()) {
				System.out.println("회원번호:" + member.getMemberNum());
				System.out.println("회원이름:" + member.getName());
				System.out.println("방문날짜:" + medical_record.getDate());
				System.out.println("담당의사:" + medical_record.getDoctor());
				System.out.println("담당간호사:" + medical_record.getNurse());
				System.out.println("치료:" + medical_record.getCure());
				System.out.println("다음방문날짜:" + medical_record.getReservation());
			}
		}

		ctx.close();
	}

}
