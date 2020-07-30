package com.javalec.ex;

import java.util.ArrayList;

public class Stu_info {

	public Stu_info() {
	}

	public Stu_info(ArrayList<Student> list) {
		this.list = list;
	}

	private ArrayList<Student> list = new ArrayList<Student>();

	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}

	public void getPrint(Stu_score score) {
		for (int i = 0; i < list.size(); i++) {
			if (score.getHak_num() == list.get(i).getHak_num()) {
				list.get(i).getPrint();
				score.getPrint();
			}
		}
	}
}
