package com.javalec.ex;

public class Student {

	public Student() {
	}

	public Student(int hak_num, String name, String major, String address, String phone) {
		this.hak_num = hak_num;
		this.name = name;
		this.major = major;
		this.address = address;
		this.phone = phone;
	}

	private int hak_num;
	private String name;
	private String major;
	private String address;
	private String phone;

	public int getHak_num() {
		return hak_num;
	}

	public void setHak_num(int hak_num) {
		this.hak_num = hak_num;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void getPrint() {
		System.out.print(hak_num + "/" + name + "/" + major + "/" + address + "/" + phone);
	}
}
