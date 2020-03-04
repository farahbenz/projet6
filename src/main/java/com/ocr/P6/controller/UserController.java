package com.ocr.P6.controller;

import com.ocr.P6.dao.UserDao;
import com.ocr.P6.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Controller
public class UserController {

    private static final Logger log = LogManager.getLogger(UserController.class);

    @Autowired
    private UserDao userDao;


    /**
     * Méthode qui va permettre la création d'un nouveau utilisateur
     */

    @RequestMapping(value = "/inscription", method = RequestMethod.GET)
    public String ajouterUtilisateur(Model model){
        log.info("Un nouveau objet user est créé");
        User user = new User();
        model.addAttribute("user", user);
        return "inscription";
    }

    /**
     * Méthode qui va permettre l'enregistrement des données utilisateur qui sera stocké dans la base de données.
     */

    @RequestMapping(value = "/inscription", method = RequestMethod.POST)
    public String enregistrerClient(User user){
        User newUser = new User(user.getName(), user.getEmail(), user.getPassword());
        userDao.save(newUser);
        log.info("Un utilisateur a été créer et stocké en base de données");
        return "index";
    }

    }