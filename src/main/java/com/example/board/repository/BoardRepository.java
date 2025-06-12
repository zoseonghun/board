package com.example.board.repository;

import com.example.board.dto.BoardDTO;
import com.example.board.dto.BoardFileDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor

public class BoardRepository {

    private final SqlSessionTemplate sql;

    public BoardDTO save(BoardDTO boardDTO) {
        sql.insert("board.save", boardDTO);
        return boardDTO;
    }

    public List<BoardDTO> findAll() {
        return  sql.selectList("board.findAll");
    }

    public void updateHits(Long id) {
        sql.update("board.updateHits", id);
    }

    public BoardDTO findById(Long id) {
        return sql.selectOne("board.findById", id);
    }

    public void update(BoardDTO boardDTO) {
        sql.update("board.update", boardDTO);
    }

    public void delete(Long id) {
        sql.delete("board.delete", id);
    }

    public void saveFile(BoardFileDTO boardFileDTO) {
        sql.insert("board.saveFile", boardFileDTO);
    }

    public List<BoardFileDTO> findFile(Long id) {
        return sql.selectList("board.findFile", id);
    }
}
