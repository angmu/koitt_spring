package com.javalec.ex.command;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.javalec.ex.dao.IDao;

public class BListCommand implements BCommand {

	@Override
	public void execute(SqlSession sqlSession, Model model) {
		// TODO Auto-generated method stub
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("list", dao.list());
	}

}
