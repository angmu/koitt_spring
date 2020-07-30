package com.javalec.ex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.javalec.ex.dto.BDto;
import com.javalec.ex.util.Constant;

public class BDao {

	public JdbcTemplate template;

	// 커넥션
	public BDao() {
		this.template = Constant.template;
	}

	// 리스트 호출
	public ArrayList<BDto> list() {
		String sql = "select * from mvc_board order by bGroup desc, bStep asc";
		// 형변환필요
		return (ArrayList<BDto>) template.query(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
	}

	// insert
	public void write(final String bName, final String bTitle, final String bContent) {
		template.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				// creator의 경우 sql이 내부에 들어간다
				String sql = "insert into mvc_board(bId,bName,bTitle,bContent,bHit,bGroup,bStep,bIndent)"
						+ " values(mvc_board_seq.nextval,?,?,?,0,mvc_board_seq.currval,0,0)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, bName);
				pstmt.setString(2, bTitle);
				pstmt.setString(3, bContent);

				return pstmt;
			}
		});
		// 형변환필요
	}

	// content view
	public BDto contentView(String bId) {
		upHit(bId);
		String sql = "select * from mvc_board where bId=?";

		return template.queryForObject(sql, new Object[] { bId }, new BeanPropertyRowMapper<BDto>(BDto.class));
	}

	// delete view
	public void delete(String bId) {
		String sql = "delete from mvc_board where bId=" + bId;
		template.update(sql);
	}

	// modify
	public void modify(final String bId, final String bName, final String bTitle, final String bContent) {

		String sql = "update mvc_board set bName=?,bTitle=?,bContent=? where bId=?";

		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bName);
				ps.setString(2, bTitle);
				ps.setString(3, bContent);
				ps.setInt(4, Integer.parseInt(bId));
			}
		});

	}

	// modify view
	public BDto modifyView(String bId) {
		String sql = "select * from mvc_board where bId=?";

		return template.queryForObject(sql, new Object[] { bId }, new BeanPropertyRowMapper<BDto>(BDto.class));
	}

	// reply_view
	public BDto reply_view(String bId) {
		String sql = "select * from mvc_board where bId=" + bId;
		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
	}

	// reply (글작성)
	public void reply(String bId, final String bName, final String bTitle, final String bContent, final String bGroup,
			final String bStep, final String bIndent) {
		replyshape(bGroup, bStep);

		String sql = "insert into mvc_board (bId,bName,bTitle,bContent,bGroup,bStep,bIndent)"
				+ " values(mvc_board_seq.nextval,?,?,?,?,?,?)";
		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setString(1, bName);
				ps.setString(2, bTitle);
				ps.setString(3, bContent);
				ps.setInt(4, Integer.parseInt(bGroup));
				ps.setInt(5, Integer.parseInt(bStep) + 1);
				ps.setInt(6, Integer.parseInt(bIndent) + 1);
			}
		});

	}

	// 리플시 같은 그룹은 현step보다 1증가
	public void replyshape(final String bGroup, final String bStep) {
		String sql = "update mvc_board set bStep=bStep+1 where bGroup=? and bStep> ?";
		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(bGroup));
				ps.setInt(2, Integer.parseInt(bStep));
			}
		});
	}

	// 조회시 bHit 증가
	public void upHit(final String bId) {
		String sql = "update mvc_board set bHit=bHit+1 where bId=?";
		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setInt(1, Integer.parseInt(bId));
			}
		});
	}

}
