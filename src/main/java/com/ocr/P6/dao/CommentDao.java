package com.ocr.P6.dao;

import com.ocr.P6.model.Comment;
import com.ocr.P6.model.Spot;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentDao extends JpaRepository<Comment, Long> {
    @Override
    List<Comment>findAll();

    @Override
    <S extends Comment> S save(S s);

    @Override
    List<Comment> findAll(Sort sort);

    List<Comment> findAllBySpot(Spot spot);
}
