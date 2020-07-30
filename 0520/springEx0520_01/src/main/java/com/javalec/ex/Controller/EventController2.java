package com.javalec.ex.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventController2 {
	@RequestMapping("/main")
	public String main() {
		return "main";
	}

	@RequestMapping("/contentView")
	public String contentView() {
		return "contentView";
	}

	@RequestMapping("event/view")
	public String view(Model model) {
		model.addAttribute("id", "naver_admin");
		model.addAttribute("pw", 1234);
		return "event/view";
	}

	@RequestMapping("/studentView")
	public String studentView(Model model) {
		model.addAttribute("stu_num", "s001");
		model.addAttribute("stu_name", "홍길동");
		model.addAttribute("major", "컴퓨터공학과");
		model.addAttribute("address", "서울시");
		model.addAttribute("tel", "010-1111-1111");

		return "studentView";
	}

	@RequestMapping("/event/modelView")
	public ModelAndView modelView() {

		ModelAndView mv = new ModelAndView();
		mv.addObject("id", "naver_admin");
		mv.addObject("pw", 1234);
		mv.setViewName("event/modelView");
		return mv;
	}
}
