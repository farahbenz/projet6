package com.ocr.P6.controller;

import com.ocr.P6.dao.CommentDao;
import com.ocr.P6.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class CommentController {

    @Autowired
    private CommentDao commentDao;

    /**
     * Méthode qui va permettre la création d'un nouveau commentaire
     */

    @RequestMapping(value = "/afficheSpot", method = RequestMethod.GET)
    public String ajouterCommentaire(Model model) {
        Comment comment = new Comment();
        model.addAttribute("comment", comment);
        return "afficheSpot";
    }

    /**
     * Méthode qui va permettre l'enregistrement d'un commentaire
     */

    @RequestMapping(value = "/afficheSpot", method = RequestMethod.POST)
    public String enregistrerCommentaire(Comment comment) {
        commentDao.save(comment);
        return "spots";
    }







}




