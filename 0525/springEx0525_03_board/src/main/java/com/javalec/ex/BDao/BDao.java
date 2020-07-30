package com.javalec.ex.BDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.javalec.ex.BDto.BDto;
import com.javalec.ex.util.Constant;

public class BDao {

	JdbcTemplate template;
	String sql;

	// jdbc연결
	public BDao() {
		template = Constant.template;
	}

	// list페이지
	public ArrayList<BDto> getlist() {
		sql = "select*from mvc_board order by bGroup desc";

		return (ArrayList<BDto>) template.query(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
	}

	// content-view페이지
	public BDto getContent(String bId) {
		// 조회수
		upHit(bId);
		sql = "select * from mvc_board where bId=" + bId;

		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));

	}
	// 글쓰기

	public void write(final String bName, final String bTitle, final String bContent) {

		template.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				// creator의 경우 sql구문이 안에 있어야한다.
				sql = "insert into mvc_board(bId,bName,bTitle,bContent,bHit,bGroup,bStep,bIndent)"
						+ "values(mvc_board_seq.nextval,?,?,?,0,mvc_board_seq.currval,0,0)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, bName);
				pstmt.setString(2, bTitle);
				pstmt.setString(3, bContent);

				return pstmt;
			}
		});

	}

	public BDto reply_view(String bId) {

		String sql = "select*from mvc_board where bId=" + bId;
		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
	}

	// 리플 글 작성

	public void reply(String bId, final String bName, final String bTitle, final String bContent, final String bGroup,
			final String bStep, final String bIndent) {
		// replyshape(bgroup,bstep)

		sql = "insert into mvc_board(bId,bName,bTitle,bContent,bGroup,bStep,bIndent)"
				+ "values(mvc_board_seq.nextval,?,?,?,?,?,?)";
		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bName);
				ps.setString(2, bTitle);
				ps.setString(3, bContent);
				System.out.println("G : " + bGroup);
				System.out.println("S :" + bStep);
				System.out.println("I: " + bIndent);
				ps.setInt(4, 4);
				ps.setInt(5, 4);
				ps.setInt(6, 4);

			}
		});
	}

	// 삭제
	public void delete(String bId) {
		sql = "delete from mvc_board where bId=" + bId;
		template.update(sql);
	}

	// 조회수 증가
	public void upHit(final String bId) {

		sql = "update mvc_board set bHit=bHit+1 where bId=?";

		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(bId));
			}
		});

//		//만약 ?없이 할라믄?
//		sql="update mvc_board set bHit=bHit+1 where bId="+bId;
//		template.batchUpdate(sql); //더 간단하게 가능.

	}

}
