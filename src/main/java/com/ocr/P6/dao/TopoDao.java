package com.ocr.P6.dao;

import com.ocr.P6.model.Topo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopoDao extends JpaRepository<Topo, Long> {
    @Override
    List<Topo> findAll();

}
