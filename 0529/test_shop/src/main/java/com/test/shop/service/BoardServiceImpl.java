package com.test.shop.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.test.shop.dao.BoardDao;
import com.test.shop.dto.BoardDto;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	BoardDao bdao;

	@Override
	public List<BoardDto> list(BoardDto boardDto) throws Exception {
		// boarddao의 list연결
		return bdao.list(boardDto);
	}

}
