package com.test.shop.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.test.shop.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Inject
	SqlSession sqlSession;

	@Override
	public List<BoardDto> list(BoardDto boardDto) {
//		//selectOne >>dto를 받아온다
//		sqlSession.selectOne("mapper namespace.id");
		// selectList는 ArrayList 파일을 받아옴.
		return sqlSession.selectList("BoardDao.list");
	}

}
