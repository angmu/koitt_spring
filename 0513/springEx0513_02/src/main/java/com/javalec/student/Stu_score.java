package com.javalec.student;

public class Stu_score {
	
	String hak_num,name;
	int kor,eng,math,total;
	double avg;
	Score_process score_process;
	
	
	
	public void setHak_num(String hak_num) {
		this.hak_num = hak_num;
	}



	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}



	public void setEng(int eng) {
		this.eng = eng;
	}



	public void setMath(int math) {
		this.math = math;
	}



	public void setTotal(int total) {
		this.total = total;
	}



	public void setAvg(double avg) {
		this.avg = avg;
	}



	public void setScore_process(Score_process score_process) {
		this.score_process = score_process;
	}



	public void stu_re() {
		score_process.score_result(avg);
	}
	
}
