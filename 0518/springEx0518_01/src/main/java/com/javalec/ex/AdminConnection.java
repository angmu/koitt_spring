package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements DisposableBean, EnvironmentAware, InitializingBean {

	private Environment env;
	private String admin_id;
	private String admin_pw;

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_pw() {
		return admin_pw;
	}

	public void setAdmin_pw(String admin_pw) {
		this.admin_pw = admin_pw;
	}

	// 클래스 생성전 env 값 호출
	public void setEnvironment(Environment environment) {
		// TODO Auto-generated method stub
		System.out.println("setEnvironment");
		setEnv(environment);
	}

	// bean객체 생성시 실행
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet");
		setAdmin_id(env.getProperty("admin.id"));
		setAdmin_pw(env.getProperty("admin.pw"));
	}

	// bean객체 소멸시 실행
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}

}
