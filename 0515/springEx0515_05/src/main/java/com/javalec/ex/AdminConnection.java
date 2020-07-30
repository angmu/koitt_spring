package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean {

	private String admin_id;
	private String admin_pw;
	private Environment env;

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("끝");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("class실행시 값을 넣음");
		setAdmin_id(env.getProperty("admin.id"));
		setAdmin_pw(env.getProperty("admin.pw"));
	}

	public void setEnvironment(Environment environment) {
		// TODO Auto-generated method stub
		setEnv(environment);
		System.out.println("class실행전 env에 값을 설정");
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

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

}
