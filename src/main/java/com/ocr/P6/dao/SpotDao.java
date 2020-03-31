package com.ocr.P6.dao;

import com.ocr.P6.model.Spot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface SpotDao extends JpaRepository<Spot, Long> , SpotDaoCustom {

    @Override
    List<Spot> findAll();

    @Override
    <S extends Spot> List<S> saveAll(Iterable<S> iterable);

    @Override
    <S extends Spot> S save(S s);


}
