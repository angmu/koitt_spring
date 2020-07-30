package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
	@Pointcut("within(com.javalec.ex.*)")
	public void aoppp() {

	}

	@Around("execution(public void bo*(..))")
	public Object logger(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("(Around)시작시간:" + System.currentTimeMillis());
		try {
			return joinPoint.proceed();
		} finally {
			System.out.println("(Around)종료시간:" + System.currentTimeMillis());
		}
	}

	@Before("aoppp()")
	public void beforeAdvice() {
		System.out.println("(before)시작시간:" + System.currentTimeMillis());
	}
}
