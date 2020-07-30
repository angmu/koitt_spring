package com.javalec.ex;

import java.text.SimpleDateFormat;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {

		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd / hh:mm:ss");
		System.out.println("조인포인트 실행");
		String st = format1.format(System.currentTimeMillis());
		System.out.println(st);
		try {
			return joinpoint.proceed();
		} finally {
			String et = format1.format(System.currentTimeMillis());
			System.out.println(et);
		}

	}
}
