package com.jardin.shop.dto;

import java.sql.Timestamp;

public class MemberDto {

	private String id;
	private String name;
	private String pw;
	private String email;
	private String email1;
	private String email2;
	private int email_check;
	private String address1;
	private String address2;
	private String address3;
	private String phone;
	private String phone1;
	private String phone2;
	private String phone3;
	private int sms;
	private String tel;
	private String tel1;
	private String tel2;
	private String tel3;
	private Timestamp birth;
	private int calender_check;
	private int point;
	private Timestamp join_date;
	private Timestamp delete_date;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email != null) {
			String[] em = email.split("@");
			setEmail1(em[0]);
			setEmail2(em[1]);
		}
		this.email = email;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public int getEmail_check() {
		return email_check;
	}

	public void setEmail_check(int email_check) {
		this.email_check = email_check;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		if (phone != null) {
			String[] ph = phone.split("-");
			setPhone1(ph[0]);
			setPhone2(ph[1]);
			setPhone3(ph[2]);
		}
		this.phone = phone;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getPhone3() {
		return phone3;
	}

	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	public int getSms() {
		return sms;
	}

	public void setSms(int sms) {
		this.sms = sms;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		if (tel != null) {
			String[] te = tel.split("-");
			setTel1(te[0]);
			setTel2(te[1]);
			setTel3(te[2]);
		}
		this.tel = tel;
	}

	public String getTel1() {
		return tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getTel2() {
		return tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public String getTel3() {
		return tel3;
	}

	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}

	public Timestamp getBirth() {
		return birth;
	}

	public void setBirth(Timestamp birth) {
		this.birth = birth;
	}

	public int getCalender_check() {
		return calender_check;
	}

	public void setCalender_check(int calender_check) {
		this.calender_check = calender_check;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public Timestamp getJoin_date() {
		return join_date;
	}

	public void setJoin_date(Timestamp join_date) {
		this.join_date = join_date;
	}

	public Timestamp getDelete_date() {
		return delete_date;
	}

	public void setDelete_date(Timestamp delete_date) {
		this.delete_date = delete_date;
	}

}
