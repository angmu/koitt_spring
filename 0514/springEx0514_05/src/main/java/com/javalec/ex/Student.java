package com.javalec.ex;

public class Student {

	public Student() {
	}

	public Student(int stu_num, String name, int kor, int eng, int math) {
		this.stu_num = stu_num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
		avg = (int) ((total / 3.0) * 10.0) / 10.0;
	}

	private int stu_num;
	private String name;
	private int kor, eng, math, total;
	private double avg;

	public void print() {
		System.out.println("학번:" + stu_num);
		System.out.println("이름:" + name);
		System.out.println("국어점수:" + kor);
		System.out.println("영어점수:" + eng);
		System.out.println("수학점수:" + math);
		System.out.println("합계:" + total);
		System.out.println("평균:" + avg);

	}

}
