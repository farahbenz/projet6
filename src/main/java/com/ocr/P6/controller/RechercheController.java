package com.ocr.P6.controller;

import com.ocr.P6.dao.SpotDao;
import com.ocr.P6.model.Spot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class RechercheController {

    @Autowired
    private SpotDao spotDao;

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String getSpotByNomAndRegion(@RequestParam("nom") String nom,String type, ModelMap modelMap) {
        List<Spot> spots = spotDao.findSpotByRegion(nom, type);
        modelMap.addAttribute("spots", spots);
        return "recherche";
    }



}
