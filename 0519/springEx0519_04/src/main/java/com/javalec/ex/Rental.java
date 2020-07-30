package com.javalec.ex;

public class Rental {

	private int mem_num;
	private String name;
	private String r_book;
	private String r_date;
	private String tel;

	public int getMem_num() {
		return mem_num;
	}

	public void setMem_num(int mem_num) {
		this.mem_num = mem_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getR_book() {
		return r_book;
	}

	public void setR_book(String r_book) {
		this.r_book = r_book;
	}

	public String getR_date() {
		return r_date;
	}

	public void setR_date(String r_date) {
		this.r_date = r_date;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void rentalPrint() {
		System.out.println("대여정보:" + mem_num + "/" + name + "/" + r_book + "/" + r_date + "/" + tel);
	}
}
