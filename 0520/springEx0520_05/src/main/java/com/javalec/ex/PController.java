package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PController {
	// http://localhost/ex/student/~ ~부터 변수로인식
	@RequestMapping("student/{studentId}")
	public String pathViewOk(@PathVariable String studentId, Model model) {
		model.addAttribute("studentId", studentId);
		return "student/pathViewOk";
	}
}
