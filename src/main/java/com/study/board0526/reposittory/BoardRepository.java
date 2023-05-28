package com.study.board0526.reposittory;

import com.study.board0526.entity.board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<board,Integer> {
}
