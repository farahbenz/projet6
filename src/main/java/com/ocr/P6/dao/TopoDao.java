package com.ocr.P6.dao;

import com.ocr.P6.model.Topo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopoDao extends JpaRepository<Topo, Long> {
    @Override
    List<Topo> findAll();

}
