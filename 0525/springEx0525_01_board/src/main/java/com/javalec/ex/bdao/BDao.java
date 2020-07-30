package com.javalec.ex.bdao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.javalec.ex.bdto.BDto;
import com.javalec.ex.util.Constant;

public class BDao {

	// jdbc 연결 template 1.커넥션, 2.dto에 담아줌 3.arraylist에도 담아줌
	JdbcTemplate template;

	// 생성할때 jdbc를 들고옴
	public BDao() {
		this.template = Constant.template;
	}

	ArrayList<BDto> dtos = new ArrayList<BDto>();
	BDto dto = new BDto();

	String sql; // String query

	public ArrayList<BDto> list() {
		sql = "select *from mvc_board order by bgroup desc";
		// Object
		return (ArrayList<BDto>) template.query(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
	}// list
		// content

	public BDto contentView(String bId) {
		// 조회수 1증가
		upHit(bId);
		sql = "select * from mvc_board where bId=" + bId;
		// 1개만일때 queryForObject
		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
	}// content
		// 조회수

	public void upHit(final String bId) {
		String sql = "update mvc_board set bHit=bHit+1 where bId=?";
		template.update(sql, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(bId));
			}
		});
	}// 조회수
}
