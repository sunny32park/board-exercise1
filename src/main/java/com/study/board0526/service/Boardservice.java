package com.study.board0526.service;

import com.study.board0526.entity.board;
import com.study.board0526.reposittory.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Boardservice {
    @Autowired
    private BoardRepository boardRepository;
    public void write(board board) {

        boardRepository.save(board);

    }

}
