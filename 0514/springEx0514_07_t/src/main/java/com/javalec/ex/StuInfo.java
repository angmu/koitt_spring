package com.javalec.ex;

import java.util.ArrayList;

public class StuInfo {
	public StuInfo() {
	}

	public StuInfo(ArrayList<Student> list) {
		this.list = list;
	}

	ArrayList<Student> list; // 선언을 하지 말아야함..

	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}

}
