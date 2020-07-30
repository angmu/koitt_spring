package com.board;

import com.board.mapper.BoardMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoardApplicationTests {

    @Autowired
    private BoardMapper mapper;

    @Test
    void contextLoads() {
    }

    // @Test
    // public void testSqlSession() throws Exception{
    // System.out.println("sqlSession: "+sqlSession);
    // }

    // @Test
    // public void testMapper() throws Exception{
    // BoardVo vo = new BoardVo();
    //
    // vo.setSubject("제목입니다");
    // vo.setContent("내용입니다");
    // vo.setWriter("작성자입니다.");
    // mapper.boardInsert(vo);
    // }

}
