package com.jardin.shop.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jardin.shop.service.BoardService;

@Controller
public class BoardController {

	@Inject
	BoardService bServ;

	@RequestMapping("list")
	public String getlist(Model model) throws Exception {
		model.addAttribute("list", bServ.list());
		return "list";
	}

}
