package com.javalec.ex;

public class MyCalculator {
	CalCulater cal;
	private int firstNum;
	private int secondNum;
	public CalCulater getCal() {
		return cal;
	}
	public void setCal(CalCulater cal) {
		this.cal = cal;
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
	
	public void add() {
		cal.add(firstNum, secondNum);
	}
	public void sub() {
		cal.sub(firstNum, secondNum);
	}
	public void multi() {
		cal.multi(firstNum, secondNum);
	}
	public void div() {
		cal.div(firstNum, secondNum);
	}
}
