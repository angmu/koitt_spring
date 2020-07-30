package com.javalec.ex;

import java.util.ArrayList;

public class Student {

	private String name;
	private int age;
	private ArrayList<String> hobbys;
	private double height;
	private double weight;

	public Student() {
	}

	public Student(String name, int age, ArrayList<String> hobbys) {
		this.name = name;
		this.age = age;
		this.hobbys = hobbys;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<String> getHobbys() {
		return hobbys;
	}

	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void getPrint() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("취미:" + hobbys);
		System.out.println("몸무게:" + height);
		System.out.println("키:" + weight);
	}
}
