package com.board.mapper;

import com.board.domain.BoardVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
// DAO
public interface BoardMapper {

    // 글 작성
    void boardInsert(BoardVo post) throws Exception;

    // 글 목록보기
    List<BoardVo> boardList(@Param("p1") int start, @Param("p2") int end) throws Exception;

    // 글 보기
    BoardVo boardView(int bId) throws Exception;

    // 조회수 증가
    void hitUp(int bId) throws Exception;

    // 글 수정
    void boardUpdate(BoardVo post) throws Exception;

    // 글 삭제
    void boardDelete(int bId) throws Exception;

    // 답글 step 1 증가
    void replyStepUp(@Param("p1") int bGroup, @Param("p2") int bStep) throws Exception;

    // 답글 달기
    void boardReply(BoardVo post) throws Exception;

    // 전체 카운트
    int getCount() throws Exception;
}
