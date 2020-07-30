package com.javalec.ex;

public class MainClass {

	public static void main(String[] args) {
		//객체선언 후 사용
		Calculation cal=new Calculation();
		Calculation cal2=new Calculation(10,5);
		cal.setFirstNum(10);
		cal.setSecondNum(5);
		cal.add();
		cal.sub();
		cal.div();
		cal.multi();
	}

}
