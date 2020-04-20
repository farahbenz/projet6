package com.ocr.P6.controller;

import com.ocr.P6.dao.CommentDao;
import com.ocr.P6.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
public class CommentController {

    @Autowired
    CommentDao commentDao;


    /**
     * Méthode qui va permettre la création d'un nouveau commentaire
     */

    @RequestMapping(value = "/commentaire/nouveau", method = RequestMethod.GET)
    public String creationCommentaire(Model model) {
        Comment comment = new Comment();
        model.addAttribute("comment", comment);
        return "afficheSpot";
    }

    /**
     * Méthode qui va permettre l'enregistrement d'un commentaire
     */

    @RequestMapping(value = "/commentaire/enregistrement", method = RequestMethod.POST)
    public String enregistrerCommentaire( Comment comment, RedirectAttributes redirectAttrs) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        comment.setAuteur(username);
        commentDao.save(comment);
        redirectAttrs.addAttribute("idSpot", comment.getSpot().getId());
        return "redirect:/spot/afficher/{idSpot}";
    }

    /**
     * Méthode qui va permettre la suppresion d'un commentaire
     */

    @RequestMapping(value = "/commentaire/supprimer/{id}", method = RequestMethod.GET)
    public String supprimerCommentaire(@PathVariable("id") Long id, Model model){
        model.addAttribute("comment", new Comment());
        commentDao.deleteById(id);

        return "redirect:/spot/afficher";
    }

    /**
     * Méthode qui va permettre la modification d'un commentaire
     */

    @RequestMapping(value = "/commentaire/modifier/{id}", method = RequestMethod.GET)
    public String afficheCommentaire(@PathVariable("id")Long id, Model model) {
        Comment comment = commentDao.findById(id).get();
        model.addAttribute("comment", comment);
        return "modifCommentaire";
    }


    @RequestMapping(value = "/commentaire/modifier", method = RequestMethod.POST)
    public String modifCommentaire( Comment comment, RedirectAttributes redirectAttrs) {
        Comment commentPrecedent = commentDao.findById(comment.getId()).get();
        commentPrecedent.setCommentaire(comment.getCommentaire());
        commentDao.save(commentPrecedent);
        redirectAttrs.addAttribute("idSpot", commentPrecedent.getSpot().getId());
        return "redirect:/spot/afficher/{idSpot}";
    }




}




