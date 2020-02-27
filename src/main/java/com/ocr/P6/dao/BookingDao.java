package com.ocr.P6.dao;

import com.ocr.P6.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingDao extends JpaRepository<Booking, Long> {
    @Override
    List<Booking> findAll();

}
