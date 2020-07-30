package com.javalec.ex.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.dao.IDao;

@Controller
public class BController {
	@Autowired
	private SqlSession sqlSession;

//	BCommand bcom;
//	JdbcTemplate template;
//
//	@Autowired
//	public void temp(JdbcTemplate template) {
//		this.template = template;
//		Constant.template = this.template;
//	}

	@RequestMapping("list")
	public String list(Model model) {
		// mybatis에 있는 객체 가져옴
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("list", dao.list());
//
//		bcom = new BListCommand();
//		bcom.execute(model);
		return "list";
	}
//
//	@RequestMapping("write_view")
//	public String write_view(Model model) {
//		return "write_view";
//	}
//
//	@RequestMapping("write") // 작성자,제목,내용
//	public String write(HttpServletRequest request, Model model) {
//		model.addAttribute("request", request);
//		bcom = new BWriteCommand();
//		bcom.execute(model);
//		return "redirect:list";
//	}
//
//	@RequestMapping("content_view") // list에서 넘어옴(제목을 클릭)
//	public String content_view(HttpServletRequest request, Model model) {
//		model.addAttribute("request", request);
//		bcom = new BContentCommand();
//		bcom.execute(model);
//		return "content_view";
//	}
//
//	@RequestMapping(value = "modify", method = RequestMethod.POST) // modify_view에서 넘어옴(저장을 클릭)
//	public String modify(HttpServletRequest request, Model model) {
//		model.addAttribute("request", request);
//		bcom = new BModifyCommand();
//		bcom.execute(model);
//		return "redirect:list";
//	}
//
//	@RequestMapping("modify_view") // content_view에서 넘어옴(수정을 클릭)
//	public String modify_view(HttpServletRequest request, Model model) {
//		model.addAttribute("request", request);
//		bcom = new BmodifyViewCommand();
//		bcom.execute(model);
//		return "modify_view";
//	}
//
//	@RequestMapping("reply_view") // content_view에서 넘어옴(답글을 클릭)
//	public String reply_view(HttpServletRequest request, Model model) {
//		model.addAttribute("request", request);
//		bcom = new BReplyViewCommand();
//		bcom.execute(model);
//		return "reply_view";
//	}
//
//	@RequestMapping("reply") // reply_view에서 넘어옴(글작성
//	public String reply(HttpServletRequest request, Model model) {
//		model.addAttribute("request", request);
//		bcom = new BReplyCommand();
//		bcom.execute(model);
//		return "redirect:list";
//	}
//
//	@RequestMapping("delete") // content_view에서 넘어옴(답글을 클릭)
//	public String delete(HttpServletRequest request, Model model) {
//		model.addAttribute("request", request);
//		bcom = new BDeleteCommand();
//		bcom.execute(model);
//		return "redirect:list";
//	}

}
