package com.javalec.ex.dao;

import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.javalec.ex.dto.BDto;
import com.javalec.ex.util.Constant;

public class BDao {

	public JdbcTemplate template;

	// 커넥션
	public BDao() {
		this.template = Constant.template;
	}

	String sql;

	// list
	public ArrayList<BDto> list() {
		sql = "select * from mvc_board order by bGroup desc, bStep asc";
		return (ArrayList<BDto>) template.query(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
	}

	// content_view
	public BDto getContent(String bId) {
		sql = "select * from mvc_board where bId=" + bId;
		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
	}
}
