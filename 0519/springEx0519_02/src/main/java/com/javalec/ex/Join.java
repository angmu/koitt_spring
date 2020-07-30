package com.javalec.ex;

public class Join {
	private int mem_num;
	private String m_id;
	private String m_pw;
	private String m_name;
	private String j_date;

	public int getMem_num() {
		return mem_num;
	}

	public void setMem_num(int mem_num) {
		this.mem_num = mem_num;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_pw() {
		return m_pw;
	}

	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getJ_date() {
		return j_date;
	}

	public void setJ_date(String j_date) {
		this.j_date = j_date;
	}

	public void joinPrint() {
		System.out.println("회원정보:" + mem_num + "/" + m_id + "/" + m_name + "/" + j_date);
	}
}
