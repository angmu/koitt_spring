package com.javalec.ex;

public class Student {

	public Student() {
	}

	public Student(int stu_num, String name, String major, String address, String tel) {
		this.stu_num = stu_num;
		this.name = name;
		this.major = major;
		this.address = address;
		this.tel = tel;

	}

	int stu_num;
	String name;
	String major;
	String address;
	String tel;

	public int getStu_num() {
		return stu_num;
	}

	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
