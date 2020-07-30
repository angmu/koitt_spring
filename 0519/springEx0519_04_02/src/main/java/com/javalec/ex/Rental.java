package com.javalec.ex;

public class Rental {
	private int member_num;
	private String name;
	private String book_ren;
	private String book_return;
	private String tel;

	public int getMember_num() {
		return member_num;
	}

	public void setMember_num(int member_num) {
		this.member_num = member_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBook_ren() {
		return book_ren;
	}

	public void setBook_ren(String book_ren) {
		this.book_ren = book_ren;
	}

	public String getBook_return() {
		return book_return;
	}

	public void setBook_return(String book_return) {
		this.book_return = book_return;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void getRental() {
		System.out.println("책 대여정보:" + member_num + "/" + name);
	}

}
