package com.ocr.P6.controller;

import com.ocr.P6.dao.SpotDao;
import com.ocr.P6.model.Spot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;


@Controller
public class SpotController {

    private static final Logger log = LogManager.getLogger(SpotController.class);

    @Autowired
    private SpotDao spotDao;


    /**
     * Méthode qui va permettre la création d'un nouveau utilisateur
     */

    @RequestMapping(value = "/ajoutSpot", method = RequestMethod.GET)
    public String ajouterSpot(Model model) {
        log.info("Un nouveau spot est créé");
        Spot spot = new Spot();
        model.addAttribute("spot", spot);
        return "ajoutSpot";
    }

    /**
     * Méthode qui va permettre l'enregistrement des données utilisateur qui sera stocké dans la base de données.
     */

    @RequestMapping(value = "/ajoutSpot", method = RequestMethod.POST)
    public String enregistrerClient(Spot spot) {
        Spot newSpot = new Spot(spot.getNom(), spot.getNombreDeVoies(), spot.getCoordoneeGeo(), spot.getCotation(), spot.getHauteur(), spot.getOrientation(), spot.getSecteur(), spot.getType());
        spotDao.save(newSpot);
        log.info("Un spot est stocké en base de données");
        return "spots";
    }

    @RequestMapping("/spots")
    public String ajouter(Model model) {
        model.addAttribute("spots", spotDao.findAll());
        return "spots";
    }


}
