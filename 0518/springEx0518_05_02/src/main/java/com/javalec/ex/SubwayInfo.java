package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SubwayInfo implements InitializingBean, DisposableBean {

	private String line;
	private String statn_nm;
	private String adres;
	private String rdnmadr;
	private String telno;

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getStatn_nm() {
		return statn_nm;
	}

	public void setStatn_nm(String statn_nm) {
		this.statn_nm = statn_nm;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getRdnmadr() {
		return rdnmadr;
	}

	public void setRdnmadr(String rdnmadr) {
		this.rdnmadr = rdnmadr;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy()");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet()");
	}

}
