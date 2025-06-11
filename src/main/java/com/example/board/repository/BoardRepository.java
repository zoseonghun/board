package com.example.board.repository;

import com.example.board.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor

public class BoardRepository {

    private final SqlSessionTemplate sqlSessionTemplate;

    public void save(BoardDTO boardDTO) {
        sqlSessionTemplate.insert("board.save", boardDTO);
    }

    public List<BoardDTO> findAll() {
        return  sqlSessionTemplate.selectList("board.findAll");
    }

    public void updateHits(Long id) {
        sqlSessionTemplate.update("board.updateHits", id);
    }

    public BoardDTO findById(Long id) {
        return sqlSessionTemplate.selectOne("board.findById", id);
    }

    public void update(BoardDTO boardDTO) {
        sqlSessionTemplate.update("board.update", boardDTO);
    }
}
