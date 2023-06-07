package com.study.board0526.service;

import com.study.board0526.entity.board;
import com.study.board0526.reposittory.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Boardservice {
    @Autowired
    private BoardRepository boardRepository;


    //글 작성 처리
    public void write(board board) {

        boardRepository.save(board);
    }

    //게시글 리스트 처리
    public List<board> boardList(){
        return boardRepository.findAll();
    }

    //특정 게시글 불러오기
    public board boardView(Integer id){
        return boardRepository.findById(id).get();
    }

    //특정 게시글 삭제
    public void boardDelete(Integer id){
        boardRepository.deleteById(id);
    }

}
