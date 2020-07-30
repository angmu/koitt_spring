package com.board.controller;

import com.board.domain.BoardVo;

import com.board.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@AllArgsConstructor
public class BoardController {

    private BoardService boardService;

    // 게시글 목록 보기
    @GetMapping(value = { "/", "board.io" })
    public String board(Model model, @RequestParam(value = "page", defaultValue = "1") int pageNum) throws Exception {
        List<BoardVo> board = boardService.getBoardList(pageNum);
        List<Integer> pageList = boardService.getPageList(pageNum);
        int maxPage = boardService.getlastNum(boardService.getBoardCount());

        model.addAttribute("list", board);
        model.addAttribute("pageList", pageList);
        model.addAttribute("maxPage", maxPage);
        model.addAttribute("page", pageNum);
        return "boardList";
    }

    // 게시글 작성 페이지
    @GetMapping("board/post.io")
    public String write() {
        return "boardWrite";
    }

    // 게시글 작성
    @PostMapping("board/post.io")
    public String write(BoardVo post) throws Exception {
        System.out.println(post);
        boardService.savePost(post);
        return "redirect:/board.io";
    }

    // 게시물 보기
    @GetMapping("board/{bid}")
    public String detail(@PathVariable("bid") int no, Model model) throws Exception {
        BoardVo dto = boardService.getPost(no);
        model.addAttribute("bdto", dto);
        return "boardContent";
    }

    // 게시물 수정페이지
    @GetMapping("board/post/{bid}")
    public ModelAndView update(@PathVariable("bid") int no) throws Exception {
        BoardVo dto = boardService.getPost(no);
        return new ModelAndView("boardUpdate", "bdto", dto);
    }

    // 게시물 수정
    @PutMapping("board/post/{bid}")
    public String update(BoardVo post, @PathVariable("bid") int no) throws Exception {
        boardService.updatePost(post);
        return "redirect:/board/" + no;
    }

    // 게시물 삭제
    @DeleteMapping("board/{bid}")
    public String delete(@PathVariable("bid") int no) throws Exception {
        boardService.deletePost(no);
        return "redirect:/board.io";
    }

    // 답글 달기 페이지
    @GetMapping("board/comment.io")
    public String reply(@RequestParam(value = "bid") int no, Model model) throws Exception {
        BoardVo dto = boardService.getPost(no);
        model.addAttribute("bdto", dto);
        return "replyWrite";
    };

    // 답글 달기
    @PostMapping("board/comment.io")
    public String reply(BoardVo boardVo) throws Exception {
        boardService.addComment(boardVo);
        return "redirect:/board.io";
    }

}
