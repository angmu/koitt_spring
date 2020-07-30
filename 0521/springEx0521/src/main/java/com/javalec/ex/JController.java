package com.javalec.ex;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.dto.LoginDto;
import com.javalec.ex.dto.MemberDto;
import com.javalec.ex.dto.StudentDto;

@Controller
public class JController {

	@RequestMapping("join02_info_input")
	public String join_input() {
		return "join02_info_input";
	}

	@RequestMapping("join03_success")
	public String join_success(MemberDto memberDto) {
		// 이름이 같아야 함. 달리 주고싶다면 @ModelAttribute("dto") MemberDto memberDto 이케 써야함.
		return "join03_success";
	}

	@RequestMapping("form")
	public String form() {
		return "form";
	}

	@RequestMapping("formOk")
	public String formOk(@ModelAttribute("stu") StudentDto studentDto) {
		return "formOk";
	}

	@RequestMapping("input")
	public String input() {
		return "input";
	}

//	@RequestMapping("inputOk") // 결과값 던지는 객체
//	public String inputOk(LoginDto loginDto, BindingResult result) {
//
//		String page = "inputOk";
//		LoginValidator validator = new LoginValidator();
//		validator.validate(loginDto, result);
//
//		if (result.hasErrors()) {
//			page = "input";
//		}
//
//		return page;
//	}
	@RequestMapping("inputOk") // 결과값 던지는 객체
	public String inputOk(@Valid LoginDto loginDto, BindingResult result) {

		String page = "inputOk";
//		LoginValidator validator = new LoginValidator();
//		validator.validate(loginDto, result);
		if (result.hasErrors()) {
			page = "input";
		}

		return page;
	}

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new LoginValidator());
	}
}
