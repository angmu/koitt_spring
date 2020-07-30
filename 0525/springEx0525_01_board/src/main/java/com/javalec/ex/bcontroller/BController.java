package com.javalec.ex.bcontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.bcommand.BCommand;
import com.javalec.ex.bcommand.BContentCommand;
import com.javalec.ex.bcommand.BListCommand;
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

	// list 링크연결
	@RequestMapping("list")
	public String list(Model model) {
		bcom = new BListCommand();
		bcom.execute(model);
		return "list";
	}

	// content_view 링크연결
	@RequestMapping("content_view")
	public String content_view(HttpServletRequest request, Model model) {
		bcom = new BContentCommand();
		model.addAttribute("request", request);
		bcom.execute(model);
		return "content_view";
	}

}
