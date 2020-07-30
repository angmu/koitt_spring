package com.javalec.ex;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

	// xml파일에서 target을 지정.
	// 대행클래스 1번째 메소드( 처음과 마지막에 실행되는 메소드)
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("조인포인트실행");
		// 시작시간(현재시간)을 starttime에 넣음
		long starttime = System.currentTimeMillis();
		System.out.println(starttime);

		try {
			// 현재진행할것이 있으면 실행해라 라는뜻
			return joinPoint.proceed();
		} finally {
			// 끝난시간(현재시간)을 endtime에 넣음
			long endtime = System.currentTimeMillis();
			System.out.println(endtime);
		}
	}

	public void beforeAdvice(Joinpoint joinpoint) {
		System.out.println("처음 실행되는 log");
		long starttime = System.currentTimeMillis();
		System.out.println(starttime);
	}

	public void afterAdive() {
		System.out.println(" :3 ");
	}

}
