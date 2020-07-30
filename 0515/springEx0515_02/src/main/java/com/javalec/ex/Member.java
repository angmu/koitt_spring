package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Member implements InitializingBean, DisposableBean {

	public Member() {
	};

	public Member(int memberNum, String name, String gender, int age, String tel, String address) {
		this.memberNum = memberNum;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.tel = tel;
		this.address = address;
	}

	private int memberNum;
	private String name;
	private String gender;
	private int age;
	private String tel;
	private String address;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Member시작");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Member끝");
	}

}
