package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.dto.LoginDto;

@Controller
public class LController {

	@RequestMapping("login")
	public String login() {
		return "login";
	}

	@RequestMapping("loginOk")
	public String loginOk(LoginDto loginDto, BindingResult result) {
		String page = "loginOk";

		LoginValidator validator = new LoginValidator();
		validator.validate(loginDto, result);

		if (result.hasErrors()) {
			page = "login";
		}

		return page;
	}
}
