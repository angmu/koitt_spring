package com.javalec.ex;

public class Book {
	private int bNum;
	private String btitle;
	private String btype;
	private String author;

	public int getBNum() {
		return bNum;
	}

	public void setBNum(int bNum) {
		this.bNum = bNum;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBtype() {
		return btype;
	}

	public void setBtype(String btype) {
		this.btype = btype;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void bookPrint() {
		System.out.println("책정보: " + bNum + "/" + btitle + "/" + btype + "/" + author);
	}
}
