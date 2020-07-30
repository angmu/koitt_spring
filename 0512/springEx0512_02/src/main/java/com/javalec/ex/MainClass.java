package com.javalec.ex;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator mycal=new MyCalculator();
		mycal.setCal(new CalCulater());
		
		mycal.setFirstNum(10);
		mycal.setSecondNum(5);
		mycal.add();
		mycal.sub();
		mycal.multi();
		mycal.div();
	}

}
