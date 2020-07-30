package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EController {
	@RequestMapping(value = "event")
	public String event() {
		return "event";
	}

	@RequestMapping(value = "eventView")
	public String eventView() {
		return "eventView";
	}
}
