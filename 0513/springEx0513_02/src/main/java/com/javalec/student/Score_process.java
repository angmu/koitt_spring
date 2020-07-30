package com.javalec.student;

public class Score_process {
	public void score_result(double avg) {
		if(avg>=90) {
			System.out.println("A학점입니다.");
		}else if(avg>=80) {
			System.out.println("B학점입니다.");
		}else if(avg>=70) {
			System.out.println("C학점입니다.");
		}else if(avg>=60) {
			System.out.println("D학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}
	}
}
