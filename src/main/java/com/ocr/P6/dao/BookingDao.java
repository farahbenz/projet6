package com.ocr.P6.dao;

import com.ocr.P6.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingDao extends JpaRepository<Booking, Long> {
    @Override
    List<Booking> findAll();

}
