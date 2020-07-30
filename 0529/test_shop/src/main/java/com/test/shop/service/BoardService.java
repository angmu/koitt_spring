package com.test.shop.service;

import java.util.List;

import com.test.shop.dto.BoardDto;

public interface BoardService {

	public List<BoardDto> list(BoardDto boardDto) throws Exception;

}
