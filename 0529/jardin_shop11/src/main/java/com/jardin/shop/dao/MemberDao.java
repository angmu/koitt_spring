package com.jardin.shop.dao;

import com.jardin.shop.dto.MemberDto;

public interface MemberDao {
	// id가 있는지 확인
	int isId(MemberDto memberDto);

	// pw일치확인
	int isPw(MemberDto memberDto);

}
