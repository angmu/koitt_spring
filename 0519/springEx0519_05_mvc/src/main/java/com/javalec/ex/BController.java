package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BController {
	@RequestMapping(value = "member/memberList")
	public String memberList() {
		return "member/memberList";
	}

}
