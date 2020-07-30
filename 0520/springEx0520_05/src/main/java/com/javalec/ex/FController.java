package com.javalec.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FController {
	@RequestMapping("form/main")
	public String main() {
		return "form/main";
	}

	@RequestMapping("form/form1")
	public String form1() {
		return "form/form1";
	}

	@RequestMapping("form/form2")
	public String form2() {
		return "form/form2";
	}

	@RequestMapping("form/form3")
	public String form3() {
		return "form/form3";
	}

	@RequestMapping("form/formOk1")
	public String formOk1(HttpServletRequest request, Model model) {
		String bnum = request.getParameter("bnum");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		String date = request.getParameter("date");
		String group = request.getParameter("group");
		String step = request.getParameter("step");
		String indent = request.getParameter("indent");

		model.addAttribute("bnum", bnum);
		model.addAttribute("btitle", btitle);
		model.addAttribute("bcontent", bcontent);
		model.addAttribute("date", date);
		model.addAttribute("group", group);
		model.addAttribute("step", step);
		model.addAttribute("indent", indent);
		return "form/formOk1";
	}

	@RequestMapping("form/formOk2")
	public ModelAndView formOk2(@RequestParam("bnum") int bnum, @RequestParam("btitle") String btitle,
			@RequestParam("bcontent") String bcontent, @RequestParam("date") String date,
			@RequestParam("group") int group, @RequestParam("step") int step, @RequestParam("indent") int indent,
			HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();

		mv.addObject("bnum", bnum);
		mv.addObject("btitle", btitle);
		mv.addObject("bcontent", bcontent);
		mv.addObject("date", date);
		mv.addObject("group", group);
		mv.addObject("step", step);
		mv.addObject("indent", indent);
		mv.setViewName("form/formOk2");
		return mv;
	}

	@RequestMapping("form/formOk3")
	public String formOk3(Bdto bdto) {

		return "form/formOk3";
	}

}
