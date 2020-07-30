package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
	// 범위를 정함
	@Pointcut("within(com.javalec.ex.*)")
	private void pointcutMethod() {

	}

//		   ("pointcutMethod()") << 범위 
	@Around("within(com.javalec.ex.Student)")
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("(around)시작시간:" + System.currentTimeMillis());
		try {
			return joinPoint.proceed();
		} finally {
			System.out.println("(around)끝난시간:" + System.currentTimeMillis());
		}
	}

	@Before("pointcutMethod()")
	public void beforeAdvice() {
		System.out.println("(before)시작시간:" + System.currentTimeMillis());
	}

}
