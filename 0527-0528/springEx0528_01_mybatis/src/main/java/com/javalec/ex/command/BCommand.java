package com.javalec.ex.command;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

public interface BCommand {
	public void execute(SqlSession sqlSession, Model model);
}
