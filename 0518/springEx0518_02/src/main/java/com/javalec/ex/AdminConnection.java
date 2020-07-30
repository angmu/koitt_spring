package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class AdminConnection implements InitializingBean, DisposableBean {

	private String admin_id;
	private String admin_pw;
	private String sub_admin_id;
	private String sub_admin_pw;

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

	public String getSub_admin_id() {
		return sub_admin_id;
	}

	public void setSub_admin_id(String sub_admin_id) {
		this.sub_admin_id = sub_admin_id;
	}

	public String getSub_admin_pw() {
		return sub_admin_pw;
	}

	public void setSub_admin_pw(String sub_admin_pw) {
		this.sub_admin_pw = sub_admin_pw;
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet()");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy()");
	}

}
