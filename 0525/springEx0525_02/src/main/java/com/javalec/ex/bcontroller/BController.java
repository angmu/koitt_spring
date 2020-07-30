package com.javalec.ex.bcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;

import com.javalec.ex.bcommand.BCommand;
import com.javalec.ex.util.Constant;

@Controller
public class BController {

	BCommand bcom = null;

	// jdbc연결
	public JdbcTemplate template;

	// 생성자나 세터등을 사용하여 의존성주입. 스프링에서 자동으로 스캔해서 바로 세팅
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}

}
