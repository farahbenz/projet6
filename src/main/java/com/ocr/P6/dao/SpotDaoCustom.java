package com.ocr.P6.dao;

import com.ocr.P6.model.Spot;

import java.util.List;

public interface SpotDaoCustom {

    List<Spot> findSpotByRegion(String nom, String type);

}
