package com.jardin.shop.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jardin.shop.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {
	@Inject
	SqlSession sqlSession;

	@Override
	public List<BoardDto> list() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("BoardDao.list");
	}

}
