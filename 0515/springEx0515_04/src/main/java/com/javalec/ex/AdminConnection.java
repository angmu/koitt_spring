package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean {

	private Environment env;
	private String adminId;
	private String adminPw;

	// EnvironmentAware 데이터값을 가져오고싶으면 set을 선언 (class가 시작되기전에 미리 만들어져서 값을 할당.)
	public void setEnvironment(Environment env) {
		// TODO Auto-generated method stub
		System.out.println("setEnvironment설정됨");
		setEnv(env);
	}

	// init 객체 생성시 실행
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("initable 객체 생성, env에서 adminid,pw값을 할당");
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));

	}

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPw() {
		return adminPw;
	}

	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("end");
	}

}
