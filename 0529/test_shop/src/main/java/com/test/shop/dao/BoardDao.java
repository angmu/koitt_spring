package com.test.shop.dao;

import java.util.List;

import com.test.shop.dto.BoardDto;

public interface BoardDao {

	List<BoardDto> list(BoardDto boardDto);
}
