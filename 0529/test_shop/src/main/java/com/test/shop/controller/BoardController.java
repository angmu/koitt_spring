package com.test.shop.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.shop.dto.BoardDto;
import com.test.shop.service.BoardService;

@Controller
public class BoardController {

	@Inject
	BoardService bServ;

	@RequestMapping("list")
	public String boardlist(@ModelAttribute BoardDto boardDto, Model model) throws Exception {
		// db list를 가져옴
		model.addAttribute("list", bServ.list(boardDto));

		return "list";
	}

}
