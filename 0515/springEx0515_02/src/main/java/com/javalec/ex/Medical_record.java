package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Medical_record implements InitializingBean, DisposableBean {

	public Medical_record() {
	}

	public Medical_record(int memberNum, String date, String doctor, String nurse, String cure, String reservation) {
		this.memberNum = memberNum;
		this.date = date;
		this.doctor = doctor;
		this.nurse = nurse;
		this.cure = cure;
		this.reservation = reservation;
	}

	private int memberNum;
	private String date;
	private String doctor;
	private String nurse;
	private String cure;
	private String reservation;

	public int getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getNurse() {
		return nurse;
	}

	public void setNurse(String nurse) {
		this.nurse = nurse;
	}

	public String getCure() {
		return cure;
	}

	public void setCure(String cure) {
		this.cure = cure;
	}

	public String getReservation() {
		return reservation;
	}

	public void setReservation(String reservation) {
		this.reservation = reservation;
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Medical_record종료");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Medical_record실행");

	}

}
