package com.jardin.shop.service;

import java.util.HashMap;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jardin.shop.dao.MemberDao;
import com.jardin.shop.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	MemberDao mdao;

	@Override
	public int idCheck(HashMap<String, String> id_map) {

		String id = id_map.get("id");
		String pw = id_map.get("pw");
		MemberDto memberDto = new MemberDto();
		memberDto.setId(id);
		memberDto.setPw(pw);
		int check = 1;
		try {
			check = mdao.isId(memberDto);
		} catch (Exception e) {
			check = -2;// 프로그램 오류
		}
		// 1이면 로그인성공. 0이면 id없음, -1이면 pw불일치
		if (check == 1) {
			try {
				check = mdao.isPw(memberDto);
			} catch (Exception e) {
				check = -3;// 프로그램오류
			}
			if (check != 1) {
				check = -1;// pw불일치 -1
			}

		} // id가 없으면 0

		return check;
	}

}
