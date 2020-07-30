package com.javalec.ex;

public class Book {
	private String book_num;
	private String name;
	private String book_class;
	private String author;

	public String getBook_num() {
		return book_num;
	}

	public void setBook_num(String book_num) {
		this.book_num = book_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBook_class() {
		return book_class;
	}

	public void setBook_class(String book_class) {
		this.book_class = book_class;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void getBook() {
		System.out.println("책정보:" + book_num + "/" + name);
	}

}
