package com.javalec.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LController {

	@RequestMapping("form")
	public String form() {
		return "form";
	}

	@RequestMapping("loginOk")
	public String loginOk() {
		return "loginOk";
	}

	@RequestMapping("loginFail")
	public String loginFail() {
		return "loginFail";
	}

	@RequestMapping("checkOk")
	public String checkOk(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		if (id.equals("admin")) {
			model.addAttribute("id", id);
			model.addAttribute("pw", request.getParameter("pw"));

			return "redirect:loginOk";
		}
		// 안써도 잘되기는 한다..
		return "loginFail";
	}

	// get,post둘다 처리가능
//	@RequestMapping("formOk")
//	public String formOk(HttpServletRequest request, Model model) {
//		model.addAttribute("id", request.getParameter("id"));
//		model.addAttribute("pw", request.getParameter("pw"));
//		return "formOk";
//	}
//	-----------------------------------------------------------------

//	//post만 가능
//	@RequestMapping(value="formOk", method = RequestMethod.POST)
//	public String formOk(HttpServletRequest request, Model model) {
//		model.addAttribute("id", request.getParameter("id"));
//		model.addAttribute("pw", request.getParameter("pw"));
//		return "formOk";
//	}
//	@PostMapping("formOk")
//	public String formOk(HttpServletRequest request, Model model) {
//		model.addAttribute("id", request.getParameter("id"));
//		model.addAttribute("pw", request.getParameter("pw"));
//		return "formOk";
//	}
//----------------------------------------------------------------------
//	// get만 가능
//	@RequestMapping(value = "formOk", method = RequestMethod.GET)
//	public String formOk(HttpServletRequest request, Model model) {
//		model.addAttribute("id", request.getParameter("id"));
//		model.addAttribute("pw", request.getParameter("pw"));
//		return "formOk";
//	}
//	@GetMapping("formOk")
//	public String formOk(HttpServletRequest request, Model model) {
//		model.addAttribute("id", request.getParameter("id"));
//		model.addAttribute("pw", request.getParameter("pw"));
//		return "formOk";
//	}

//	@RequestMapping("formOk")
//	public String formOk(Student student) {
//		return "formOk";
//	}

	// 별칭쓰기
	@RequestMapping("formOk")
	public String formOk(@ModelAttribute("stu") Student student) {
		return "formOk";
	}
}
