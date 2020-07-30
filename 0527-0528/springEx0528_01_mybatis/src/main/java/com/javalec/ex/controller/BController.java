package com.javalec.ex.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.command.BCommand;
import com.javalec.ex.command.BListCommand;
import com.javalec.ex.dao.IDao;
import com.javalec.ex.dto.BDto;

@Controller
public class BController {
	@Autowired
	private SqlSession sqlSession;
	BCommand bcom;
	JdbcTemplate template;

	@Autowired
	public void template(JdbcTemplate template) {
		this.template = template;
	}

	@RequestMapping("list")
	public String list(Model model) {
		// mybatis에 있는 객체 가져옴
		bcom = new BListCommand();
		bcom.execute(sqlSession, model);
//		IDao dao = sqlSession.getMapper(IDao.class);
//		model.addAttribute("list", dao.list());
		return "list";
	}

	@RequestMapping("write_view")
	public String write_view(Model model) {
		return "write_view";
	}

	@RequestMapping("write")
	public String write(BDto bDto, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.write(bDto.getbName(), bDto.getbTitle(), bDto.getbContent());
		return "redirect:list";
	}

	@RequestMapping("content_view")
	public String content_view(HttpServletRequest request, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.upHit(request.getParameter("bId"));
		model.addAttribute("content_view", dao.contentView(request.getParameter("bId")));
		return "content_view";
	}

	@RequestMapping("modify_view")
	public String modify_view(HttpServletRequest request, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("modify_view", dao.contentView(request.getParameter("bId")));
		return "modify_view";
	}

	@RequestMapping("modify")
	public String modify(BDto bDto, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.modify(bDto.getbId(), bDto.getbName(), bDto.getbTitle(), bDto.getbContent());
		return "redirect:list";
	}

	@RequestMapping("delete")
	public String delete(HttpServletRequest request, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.delete(request.getParameter("bId"));
		return "redirect:list";
	}

	@RequestMapping("reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("reply_view", dao.reply_view(request.getParameter("bId")));
		return "reply_view";
	}

	@RequestMapping("reply")
	public String reply(BDto bDto, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.replyshape(bDto.getbGroup(), bDto.getbStep());
		dao.reply(bDto.getbName(), bDto.getbTitle(), bDto.getbContent(), bDto.getbGroup(), bDto.getbStep(),
				bDto.getbIndent());
		return "reply";
	}

	@RequestMapping("loginCheck")
	public String reply(BDto bDto, Model model, HttpSession session) {
		String page = "";
		IDao dao = sqlSession.getMapper(IDao.class);

		if (dao.loginCheck(bDto) == null) {
			System.out.println("로그인실패");
			session.invalidate();
			page = "login";
		} else {
			session.setAttribute("user_id", bDto.getbId());
			session.setAttribute("user_name", bDto.getbName());
			page = "redirect:main";
		}

		return page;
	}
}
