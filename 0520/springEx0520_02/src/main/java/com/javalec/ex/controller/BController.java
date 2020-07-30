package com.javalec.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BController {

	@RequestMapping("/board/form")
	public String form() {
		return "board/form";
	}
//
//	@RequestMapping("board/formOk")
//	public String formOk(HttpServletRequest request, Model model) {
//
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//
//		model.addAttribute("id", id);
//		model.addAttribute("pw", pw);
//
//		return "board/formOk";
//	}

	@RequestMapping(value = "board/formOk", method = RequestMethod.POST)
	public String formOk(HttpServletRequest request, Model model) {

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "board/formOk";
	}

	@RequestMapping(value = "board/formOk", method = RequestMethod.GET)
	public ModelAndView formOk(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		mv.addObject("id", id);
		mv.addObject("pw", pw);
		mv.setViewName("board/formOk");
		return mv;
	}

}
