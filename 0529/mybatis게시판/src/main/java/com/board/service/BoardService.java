package com.board.service;

import com.board.domain.BoardVo;
import com.board.mapper.BoardMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class BoardService {
    private BoardMapper boardMapper;

    private static final int ROW_LIMIT = 5; // 밑에 몇개씩 보여줄건지
    private static final int PAGE_LIMIT = 10; // 한 페이지당 몇개 보여줄건지

    public List<BoardVo> getBoardList(int pageNum) throws Exception {

        int startTuple = (pageNum - 1) * PAGE_LIMIT + 1;
        int endTuple = startTuple + PAGE_LIMIT - 1;

        return boardMapper.boardList(startTuple, endTuple);
    }

    public List<Integer> getPageList(int pageNum) throws Exception {
        List<Integer> pageList = new ArrayList<>();

        // 총 게시글 갯수
        Double totalCnt = Double.valueOf(this.getBoardCount());
        // 마지막 페이지 번호 계산
        int lastPageNum = getlastNum(totalCnt);

        // 시작 페이지 번호 설정
        int startPageNum = ((int) (Math.ceil((double) pageNum / ROW_LIMIT) - 1) * ROW_LIMIT) + 1;
        // 현재 페이지를 기준으로 마지막 페이지 번호 조정
        lastPageNum = (lastPageNum > startPageNum + ROW_LIMIT - 1) ? startPageNum + ROW_LIMIT - 1 : lastPageNum;

        // 페이지 번호 할당
        for (int val = startPageNum; val <= lastPageNum; val++) {
            pageList.add(val);
        }

        return pageList;
    }

    // 마지막 페이지 번호 계산
    public int getlastNum(double cnt) {
        return (int) (Math.ceil(cnt / PAGE_LIMIT));
    }

    // 전체 게시글 카운트
    public int getBoardCount() throws Exception {
        return boardMapper.getCount();
    }

    @Transactional
    public void savePost(BoardVo boardVo) throws Exception {
        boardMapper.boardInsert(boardVo);
    }

    public BoardVo getPost(int bId) throws Exception {
        boardMapper.hitUp(bId);
        return boardMapper.boardView(bId);
    }

    @Transactional
    public void updatePost(BoardVo boardVo) throws Exception {
        boardMapper.boardUpdate(boardVo);
    }

    @Transactional
    public void deletePost(int bId) throws Exception {
        boardMapper.boardDelete(bId);
    }

    @Transactional
    public void addComment(BoardVo boardVo) throws Exception {
        boardMapper.replyStepUp(boardVo.getBGroup(), boardVo.getBStep());
        boardMapper.boardReply(boardVo);
    }

}
