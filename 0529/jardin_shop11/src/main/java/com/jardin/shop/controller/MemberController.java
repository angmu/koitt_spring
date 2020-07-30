package com.jardin.shop.controller;

import java.util.HashMap;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jardin.shop.service.MemberService;

@Controller
@RequestMapping("member")
public class MemberController {

	@Inject
	MemberService mServ;

	@RequestMapping("login_view")
	public String login_view() {
		return "member/login";
	}

	@RequestMapping("join_view")
	public String join_view() {
		return "member/step01";
	}

	@ResponseBody
	@RequestMapping("id_check")
	public int login_ok(@RequestBody HashMap<String, String> id_map, HttpSession session) {
		int check = mServ.idCheck(id_map);
		if (check == 1) {
			session.setAttribute("loginInfo", id_map.get("id"));
		}
		return check;
	}

	@RequestMapping("logout")
	public String logout(HttpSession session, RedirectAttributes redirectAttr) {
		session.removeAttribute("loginInfo");
		redirectAttr.addFlashAttribute("logout", "ok");
		return "redirect:/main";
	}

	@RequestMapping("step02")
	public String join_view2(RedirectAttributes redirectAttr) {
		redirectAttr.addFlashAttribute("key", "ok");
		return "redirect:/member/step02_view";
	}

	@RequestMapping("step02_view")
	public String join_view2_() {
		return "member/step02";
	}

	@RequestMapping("step03")
	public String join_view3(RedirectAttributes redirectAttr) {
		redirectAttr.addFlashAttribute("key", "ok");
		return "redirect:/member/step03_view";
	}

	@RequestMapping("step03_view")
	public String join_view3_() {
		return "member/step03";
	}

	@RequestMapping("step04")
	public String join_view4() {
		return "member/step04";
	}
}
