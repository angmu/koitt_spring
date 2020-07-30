package com.javalec.ex;

public class DoctorRecord {
	private int member_num;
	private String mem_name;
	private String doctor;
	private String date;

	public void doctor_print() {
		System.out.println("환자정보:" + member_num + "/" + mem_name);
	}

	public int getMember_num() {
		return member_num;
	}

	public void setMember_num(int member_num) {
		this.member_num = member_num;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
