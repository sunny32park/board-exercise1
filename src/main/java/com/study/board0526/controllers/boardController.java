package com.study.board0526.controllers;

import com.study.board0526.entity.board;
import com.study.board0526.service.Boardservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class boardController {
    @Autowired
    private Boardservice boardService;
    @GetMapping("/board/write") // localhost:8080/board/write
    public String boardWriteForm(){
        return "boardwrite";
    }

    @PostMapping("/board/writepro")
    public String boardWritePro(board board){

        boardService.write(board);

        return "";
    }

}
