package com.javalec.ex;

public class BMICalculator {

	private double lowWeight;// 저체중
	private double normal;// 보통
	private double overWeight;// 과체중
	private double obesity;// 고비만

	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}

	public void setNormal(double normal) {
		this.normal = normal;
	}

	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}

	public void bmicalculation(double weight, double height) {
		double h = height * 0.01;
		double result = weight / (h * h);// bmi지수

		System.out.println("당신의 BMI지수:" + result);

		if (result > obesity) {
			System.out.println("고비만입니다.");
		} else if (result > overWeight) {
			System.out.println("과체중입니다.");
		} else if (result > normal) {
			System.out.println("보통입니다.");
		} else {
			System.out.println("저체중입니다.");
		}

//		//아래처럼하면.. 나중에 기준이 바뀌었을때 다 고쳐야한다..
//		if (result > 50) {
//			System.out.println("고비만입니다.");
//		} else if (result > 40) {
//			System.out.println("과체중입니다.");
//		} else if (result > 30) {
//			System.out.println("보통입니다.");
//		} else {
//			System.out.println("저체중입니다.");
//		}

	}

}
