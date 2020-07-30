package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BController {

	@RequestMapping(value = "login")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "join/join")
	public String join() {
		return "join";
	}

	@RequestMapping(value = "board/reviewList")
	public String reviewList() {
		return "board/reviewList";
	}

	@RequestMapping(value = "board/noticeList")
	public String noticeList() {
		return "board/noticeList";
	}

	@RequestMapping(value = "board/eventList")
	public String eventList() {
		return "board/eventList";
	}
}
