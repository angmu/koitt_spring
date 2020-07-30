package com.javalec.ex;

public class Temperature {
	String nav;
	double temp;
	
	Calculator calculator;
	
	public void setNav(String nav) {
		this.nav = nav;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public void trans_temp() {
		calculator.temp_tran(temp);
	}
}
