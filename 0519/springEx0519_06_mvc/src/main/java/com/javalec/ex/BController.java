package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BController {
	@RequestMapping(value = "update")
	public String update() {
		return "update";
	}

	@RequestMapping(value = "insert")
	public String insert() {
		return "insert";
	}

	@RequestMapping(value = "delete")
	public String delete() {
		return "delete";
	}
}
