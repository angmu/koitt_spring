package com.javalec.ex;

public class BookLoan {
	private int stu_num;
	private String b_Num;
	private String b_Title;
	private String division;
	private String loanDate;
	private String returnDate;
	private String arrears;

	public int getStu_num() {
		return stu_num;
	}

	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
	}

	public String getB_Num() {
		return b_Num;
	}

	public void setB_Num(String b_Num) {
		this.b_Num = b_Num;
	}

	public String getB_Title() {
		return b_Title;
	}

	public void setB_Title(String b_Title) {
		this.b_Title = b_Title;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public String getArrears() {
		return arrears;
	}

	public void setArrears(String arrears) {
		this.arrears = arrears;
	}

	public void getBookloan() {
		System.out.println("학번: " + getStu_num());
		System.out.println("도서번호: " + getB_Num());
		System.out.println("도서제목: " + getB_Title());
		System.out.println("분류: " + getDivision());
		System.out.println("대출일자: " + getLoanDate() + "/반납일자: " + getReturnDate() + "/연체일: " + getArrears());
	}
}
