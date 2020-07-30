package com.javalec.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.command.BCommand;
import com.javalec.ex.command.BContentCommand;
import com.javalec.ex.command.BListCommand;
import com.javalec.ex.util.Constant;

@Controller
public class BController {

	JdbcTemplate template;
	BCommand bcom;

	@Autowired
	public void template(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}

	@RequestMapping("list")
	public String list(Model model) {
		bcom = new BListCommand();
		bcom.execute(model);
		return "list";
	}

	@RequestMapping("content_view")
	public String content_view(HttpServletRequest request, Model model) {
		bcom = new BContentCommand();
		model.addAttribute("request", request);
		bcom.execute(model);
		return "content_view";
	}

}
