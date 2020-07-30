package com.javalec.ex.BCommand;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.javalec.ex.BDao.BDao;
import com.javalec.ex.BDto.BDto;

public class BListcommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.getlist();
		model.addAttribute("list", dtos);
	}

}
