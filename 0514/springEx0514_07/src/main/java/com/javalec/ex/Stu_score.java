package com.javalec.ex;

public class Stu_score {

	public Stu_score() {
	}

	public Stu_score(int hak_num, int kor, int eng, int math) {
		this.hak_num = hak_num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = ((int) ((total / 3.0) * 10.0)) / 10.0;
	}

	private int hak_num;
	private int kor, eng, math, total;
	private double avg;

	public int getHak_num() {
		return hak_num;
	}

	public void setHak_num(int hak_num) {
		this.hak_num = hak_num;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public void getPrint() {
		System.out.print("/" + kor + "/" + eng + "/" + math + "/" + total + "/" + avg);
		System.out.println();
	}
}
