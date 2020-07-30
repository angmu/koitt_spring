package com.javalec.ex;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.dto.BoardDto;

@Controller
public class NController {

	@RequestMapping("board")
	public String board() {
		return "board";
	}

	@RequestMapping("boardOk")
	public String boardOk(@Valid @ModelAttribute("br") BoardDto boardDto, BindingResult result) {
		String page = "boardOk";

		if (result.hasErrors()) {
			page = "board";
		}

		return page;
	}

	@InitBinder
	private void boardValidator(WebDataBinder binder) {
		binder.setValidator(new BoardValidator());
	}
}
