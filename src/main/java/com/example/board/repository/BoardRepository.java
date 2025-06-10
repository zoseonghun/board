package com.example.board.repository;

import com.example.board.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor

public class BoardRepository {

    private final SqlSessionTemplate sqlSessionTemplate;

    public void save(BoardDTO boardDTO) {
        sqlSessionTemplate.insert("board.save", boardDTO);
    }
}
