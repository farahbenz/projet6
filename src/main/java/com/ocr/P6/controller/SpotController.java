package com.ocr.P6.controller;

import com.ocr.P6.dao.CommentDao;
import com.ocr.P6.dao.SpotDao;
import com.ocr.P6.model.Comment;
import com.ocr.P6.model.Spot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class SpotController {


    @Autowired
    private SpotDao spotDao;
    @Autowired
    private CommentDao commentDao;

    /**
     * Méthode qui va permettre la création d'un nouveau spot
     */

    @RequestMapping(value = "/ajoutSpot", method = RequestMethod.GET)
    public String ajouterSpot(Model model) {
        Spot spot = new Spot();
        model.addAttribute("spot", spot);
        return "ajoutSpot";
    }

    /**
     * Méthode qui va permettre l'enregistrement des données spot.
     */

    @RequestMapping(value = "/ajoutSpot", method = RequestMethod.POST)
    public String enregistrerSpot(Spot spot) {
        Spot newSpot = new Spot(spot.getNom(), spot.getNombreDeVoies(), spot.getCoordoneeGeo(), spot.getCotation(), spot.getHauteur(), spot.getOrientation(), spot.getSecteur(), spot.getType());
        spotDao.save(newSpot);
        return "redirect:/spots";
    }

    /**
     * Méthode qui va permettre l'affichage des spots.
     */
    @RequestMapping("/spots")
    public String affichage(Model model) {
        model.addAttribute("spots", spotDao.findAll());
        return "spots";
    }

    /**
     * Méthode qui va permettre l'affichage d'un spot et de ses commentaires.
     */

    @RequestMapping(value = "/afficheSpot/{id}")
    public String getIdSpot(@PathVariable("id") Long id, Model model) {
        Spot spot = spotDao.findById(id).get();
        model.addAttribute("spot", spot);
        model.addAttribute("comment", new Comment());
        model.addAttribute("comments", commentDao.findAllBySpot(spot));
        return "afficheSpot";
    }
}


