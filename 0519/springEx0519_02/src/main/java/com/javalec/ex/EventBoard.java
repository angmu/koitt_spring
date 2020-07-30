package com.javalec.ex;

public class EventBoard {
	private int b_num;
	private String b_title;
	private String b_content;
	private String st_date;
	private String en_date;

	public int getB_num() {
		return b_num;
	}

	public void setB_num(int b_num) {
		this.b_num = b_num;
	}

	public String getB_title() {
		return b_title;
	}

	public void setB_title(String b_title) {
		this.b_title = b_title;
	}

	public String getB_content() {
		return b_content;
	}

	public void setB_content(String b_content) {
		this.b_content = b_content;
	}

	public String getSt_date() {
		return st_date;
	}

	public void setSt_date(String st_date) {
		this.st_date = st_date;
	}

	public String getEn_date() {
		return en_date;
	}

	public void setEn_date(String en_date) {
		this.en_date = en_date;
	}

	public void eventPrint() {
		System.out.println("event:" + b_num + "/" + b_title + "/" + st_date + "/" + en_date);
	}
}
