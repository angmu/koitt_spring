package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.Dto.StudentDto;

@Controller
public class SController {

	@RequestMapping("form")
	public String form() {

		return "form";
	}

	@RequestMapping("formOk")
	public String formOk(@ModelAttribute("stu") StudentDto studentDto, BindingResult result) {
		String page = "formOk";

		StuValidator validator = new StuValidator();
		validator.validate(studentDto, result);

		if (result.hasErrors()) {
			page = "form";
		}

		return page;
	}

}
