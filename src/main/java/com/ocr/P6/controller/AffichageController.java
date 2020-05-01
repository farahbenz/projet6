package com.ocr.P6.controller;

import com.ocr.P6.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AffichageController {

    /**
     * Méthodes qui vont permettre d'afficher ces différentes pages
     */

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String affichageIndex(){
        return "index";
    }
    @RequestMapping(value = "/acceuil", method = RequestMethod.GET)
    public String affichageAcceuil(){
        return "acceuil";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String AfficheContact(){
        return "contact";
    }

    @RequestMapping(value = "/DropMenu", method = RequestMethod.GET)
    public String ajouterSpot(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "acceuil";
    }
}
