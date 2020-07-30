package com.javalec.ex;

public class Calculation {
	
	
	private int firstNum;
	private int secondNum;
	public Calculation() {};
	
	public Calculation(int firstNum,int secondNum) {
		this.firstNum=firstNum;
		this.secondNum=secondNum;
	}
	
	
	public void add() {
		int result=firstNum+secondNum;
		System.out.println("firstNum+secondNum="+result);
	}
	public void sub() {
		int result=firstNum-secondNum;
		System.out.println("firstNum-secondNum="+result);
	}
	public void multi() {
		int result=firstNum*secondNum;
		System.out.println("firstNum*secondNum="+result);
	}
	public void div() {
		int result=firstNum/secondNum;
		System.out.println("firstNum/secondNum="+result);
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
