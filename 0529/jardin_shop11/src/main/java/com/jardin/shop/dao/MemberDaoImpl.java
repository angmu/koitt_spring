package com.jardin.shop.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jardin.shop.dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Inject
	SqlSession sqlsession;

	@Override
	public int isId(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return sqlsession.selectOne("MemberDao.idCh", memberDto);
	}

	@Override
	public int isPw(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return sqlsession.selectOne("MemberDao.pwCh", memberDto);
	}

}
