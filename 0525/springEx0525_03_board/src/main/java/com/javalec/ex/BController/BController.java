package com.javalec.ex.BController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.BCommand.BCommand;
import com.javalec.ex.BCommand.BContentcommand;
import com.javalec.ex.BCommand.BDeleteCommand;
import com.javalec.ex.BCommand.BListcommand;
import com.javalec.ex.BCommand.BReplyCommand;
import com.javalec.ex.BCommand.BReplyViewCommand;
import com.javalec.ex.BCommand.BWriteCommand;
import com.javalec.ex.util.Constant;

@Controller
public class BController {

	JdbcTemplate template;
	BCommand bcom = null;

	public BController() {
	}

	@Autowired
	public BController(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}

	@RequestMapping("list")
	public String list(Model model) {
		bcom = new BListcommand();
		bcom.execute(model);
		return "list";
	}

	@RequestMapping("content_view")
	public String content_view(HttpServletRequest request, Model model) {
		bcom = new BContentcommand();
		model.addAttribute("request", request);
		bcom.execute(model);
		return "content_view";
	}

	@RequestMapping("write")
	public String write(Model model) {
		return "write_view";
	}

	@RequestMapping("write_view")
	public String write_view(HttpServletRequest request, Model model) {
		bcom = new BWriteCommand();
		model.addAttribute("request", request);
		bcom.execute(model);

		return "redirect:list";
	}

	@RequestMapping("delete")
	public String delete(HttpServletRequest request, Model model) {
		bcom = new BDeleteCommand();
		model.addAttribute("request", request);
		bcom.execute(model);
		return "redirect:list";
	}

	@RequestMapping("reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		bcom = new BReplyViewCommand();
		model.addAttribute("request", request);
		bcom.execute(model);
		return "reply_view";
	}

	@RequestMapping("reply")
	public String reply(HttpServletRequest request, Model model) {
		bcom = new BReplyCommand();
		model.addAttribute("request", request);
		bcom.execute(model);
		return "redirect:list";
	}

}
