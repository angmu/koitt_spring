package com.jardin.shop.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jardin.shop.dao.BoardDao;
import com.jardin.shop.dto.BoardDto;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	BoardDao bdao;

	@Override
	public List<BoardDto> list() throws Exception {
		// TODO Auto-generated method stub
		return bdao.list();
	}

}
