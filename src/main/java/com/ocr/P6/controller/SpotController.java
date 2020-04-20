package com.ocr.P6.controller;

import com.ocr.P6.dao.CommentDao;
import com.ocr.P6.dao.SpotDao;
import com.ocr.P6.dao.UserDao;
import com.ocr.P6.model.Comment;
import com.ocr.P6.model.Spot;
import com.ocr.P6.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class SpotController {


    @Autowired
    private SpotDao spotDao;
    @Autowired
    private CommentDao commentDao;
    @Autowired
    private UserDao userDao;

    /**
     * Méthode qui va permettre la création d'un nouveau spot
     */

    @RequestMapping(value = "/ajoutSpot", method = RequestMethod.GET)
    public String creationSpot(Model model) {
        Spot spot = new Spot();
        model.addAttribute("spot", spot);
        return "ajoutSpot";
    }

    /**
     * Méthode qui va permettre l'enregistrement des données spot.
     */

    @RequestMapping(value = "/ajoutSpot", method = RequestMethod.POST)
    public String enregistrerSpot(Spot spot) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        User user = userDao.findByUsername(username);
        spot.setUser(user);
        spotDao.save(spot);
        return "redirect:/spots";
    }

    /**
     * Méthode qui va permettre l'affichage des spots.
     */
    @RequestMapping("/spots")
    public String affichageSpots(Model model) {
        model.addAttribute("spots", spotDao.findAll());
        return "spots";
    }

    /**
     * Méthode qui va permettre l'affichage d'un spot et de ses commentaires.
     */

    @RequestMapping(value = "/afficheSpot/{id}")
    public String reucpererIdSpot(@PathVariable("id") Long id, Model model) {
        Spot spot = spotDao.findById(id).get();
        model.addAttribute("spot", spot);
        model.addAttribute("comment", new Comment());
        model.addAttribute("comments", commentDao.findAllBySpot(spot));
        return "afficheSpot";
    }

    /**
     * Methode qui permet de modifier le tag
     */

    @RequestMapping(value ="/tag/modifier/{id}", method = RequestMethod.GET)
    public String modifierTag(@PathVariable("id")Long id, RedirectAttributes redirectAttrs) {
        Spot spot = spotDao.findById(id).get();
        spot.setTag(!spot.isTag());
        spotDao.save(spot);
        redirectAttrs.addAttribute("idSpot",id);
        return "redirect:/afficheSpot/{idSpot}";
    }

}


