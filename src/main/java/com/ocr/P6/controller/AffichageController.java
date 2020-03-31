package com.ocr.P6.controller;

import com.ocr.P6.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AffichageController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/acceuil", method = RequestMethod.GET)
    public String acceuil(){
        return "acceuil";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contact(){
        return "contact";
    }


    @RequestMapping(value = "/DropMenu", method = RequestMethod.GET)
    public String ajouterSpot(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "acceuil";
    }

}
