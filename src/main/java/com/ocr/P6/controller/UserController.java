package com.ocr.P6.controller;

import com.ocr.P6.dao.UserDao;
import com.ocr.P6.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class UserController {


    @Autowired
    private UserDao userDao;


    @RequestMapping(value = "/inscription", method = RequestMethod.GET)
    public String ajouterUtilisateur(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "inscription";
    }

    @RequestMapping(value = "/inscription", method = RequestMethod.POST)
    public String enregistrerClient(User user){
        User users = new User(user.getName(), user.getEmail(), user.getPassword());
        userDao.save(users);
        return "index";
    }

    }