package com.javalec.ex;

import java.text.SimpleDateFormat;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	// around용 메소드
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
		// 시작전 실행
		long st = System.currentTimeMillis();
		System.out.println("메소드시작시간:" + format1.format(st));

		try {
			return joinPoint.proceed();// 실행메소드 호출
		} finally {
			long et = System.currentTimeMillis();
			System.out.println("메소드 종료시간: " + format1.format(et));
		}
	}

	// before
	public void beforeadvice() {
		long st = System.currentTimeMillis();
		System.out.println("(before)메소드 시작시간:" + format1.format(st));
	}

}
