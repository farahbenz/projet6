package com.ocr.P6.dao;

import com.ocr.P6.model.Spot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpotDao extends JpaRepository<Spot, Long> {
    @Override
    List<Spot> findAll();

}
