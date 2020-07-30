package com.javalec.ex;

public class Calculation2 {

	private int firstNum;
	private int secondNum;
	
	public void add() {
		int result=(firstNum+secondNum)*2;
		System.out.println("(firstNum+secondNum)*2="+result);
	}
	public void sub() {
		int result=(firstNum-secondNum)*2;
		System.out.println("(firstNum-secondNum)*2="+result);
	}
	public void multi() {
		int result=(firstNum*secondNum)*2;
		System.out.println("(firstNum*secondNum)*2="+result);
	}
	public void div() {
		int result=(firstNum/secondNum)*2;
		System.out.println("(firstNum/secondNum)*2="+result);
	}
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
}
