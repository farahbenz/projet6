package com.ocr.P6.controller;

import com.ocr.P6.dao.UserDao;
import com.ocr.P6.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    UserDao userDao;

    /**
     * Méthode qui va permettre la création d'un nouveau utilisateur
     */

    @RequestMapping(value = "/inscription", method = RequestMethod.GET)
    public String ajouterUtilisateur(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "inscription";
    }

    /**
     * Méthode qui va permettre l'enregistrement des données utilisateur qui sera stocké dans la base de données.
     */

    @RequestMapping(value = "/inscription", method = RequestMethod.POST)
    public String enregistrerClient(User user){
        User newUser = new User(user.getUsername(), user.getEmail(), user.getPassword());
        userDao.save(newUser);
        return "index";
    }

    }