package com.jardin.shop.service;

import java.util.List;

import com.jardin.shop.dto.BoardDto;

public interface BoardService {

	List<BoardDto> list() throws Exception;
}
