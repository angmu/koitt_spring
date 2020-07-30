package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	// round용
	public Object loggeraop(ProceedingJoinPoint joinPoint) throws Throwable {

		long st = System.currentTimeMillis();
		System.out.println("시작전 시간:" + st);
		try {
			return joinPoint.proceed();
		} finally {
			long et = System.currentTimeMillis();
			System.out.println("종료시간:" + et);
		}

	}

	// before용
	public void beforePrint() {
		System.out.println("메소드시작전 프린트");
	}

	// after용
	public void afterPrint() {
		System.out.println("메소드끝날때 프린트");
	}
}
