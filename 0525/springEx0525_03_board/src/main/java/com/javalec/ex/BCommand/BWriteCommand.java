package com.javalec.ex.BCommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.ex.BDao.BDao;

public class BWriteCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");

		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		String bName = request.getParameter("bName");

		BDao dao = new BDao();
		dao.write(bName, bTitle, bContent);

	}

}
