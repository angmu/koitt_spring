package com.javalec.ex.bcommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.ex.bdao.BDao;
import com.javalec.ex.bdto.BDto;

public class BContentCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// 17강 >>model객체는 hashmap형채를 가지고있음. key와 value로 사용. (object형태로 리턴)
		// key,value
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bId = request.getParameter("bId");

		BDao dao = new BDao();
		BDto dto = dao.contentView(bId);

		model.addAttribute("content_view", dto);
	}

}
