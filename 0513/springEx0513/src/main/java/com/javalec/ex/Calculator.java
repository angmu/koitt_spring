package com.javalec.ex;

public class Calculator {
	public void addtion(int f,int s) {
		System.out.println("addition");
		int result=f+s;
		System.out.println(f+"+"+s+"="+result);
	}
	public void subtraction(int f,int s) {
		System.out.println("sub");
		int result=f-s;
		System.out.println(f+"-"+s+"="+result);
	}
	public void multiplication(int f,int s) {
		System.out.println("multi");
		int result=f*s;
		System.out.println(f+"*"+s+"="+result);
	}
	public void division(int f,int s) {
		System.out.println("div");
		int result=f/s;
		System.out.println(f+"/"+s+"="+result);
	}
}
