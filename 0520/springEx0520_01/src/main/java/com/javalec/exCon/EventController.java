package com.javalec.exCon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventController {

	@RequestMapping("/contentView2")
	public String contentView() {
		return "contentView";
	}
}
