package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

	public void beforeAdvice() {
		System.out.println("(before)시작시간: " + System.currentTimeMillis());
	}

	public void afterAdvice() {
		System.out.println("(after)종료시간: " + System.currentTimeMillis());
	}

	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
		long st = System.currentTimeMillis();
		System.out.println("(around)시작시간: " + st);
		try {
			return joinPoint.proceed();
		} finally {
			long et = System.currentTimeMillis();
			System.out.println("(around)경과시간: " + (et - st));
		}
	}

}
