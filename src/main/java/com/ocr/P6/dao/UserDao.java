package com.ocr.P6.dao;

import com.ocr.P6.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserDao extends JpaRepository<User, Long> {

    @Override
    <S extends User> List<S> saveAll(Iterable<S> iterable);

    @Override
    <S extends User> S save(S s);
}
