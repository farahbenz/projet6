package com.ocr.P6.dao;

import com.ocr.P6.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentDao extends JpaRepository<Comment, Long> {
    @Override
    List<Comment>findAll();

}
