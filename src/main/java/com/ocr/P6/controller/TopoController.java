package com.ocr.P6.controller;

import com.ocr.P6.dao.TopoDao;
import com.ocr.P6.dao.UserDao;
import com.ocr.P6.model.Topo;
import com.ocr.P6.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class TopoController {

    @Autowired
    private TopoDao topoDao;

    @Autowired
    private UserDao userDao;

    /**
     * Méthode qui va permettre la création d'un nouveau topo
     */

    @RequestMapping(value = "/ajoutTopo", method = RequestMethod.GET)
    public String ajouterTopo(Model model) {

        Topo topo = new Topo();
        model.addAttribute("topo", topo);

        return "ajoutTopo";

    }

    /**
     * Méthode qui va permettre l'enregistrement des données topos.
     */

    @RequestMapping(value = "/ajoutTopo", method = RequestMethod.POST)
    public String enregistrerTopo(Topo topo) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        User user = userDao.findByUsername(username);
        topo.setUser(user);
        topoDao.save(topo);

        return "redirect:/topos";
    }

    /**
     * Méthode qui va permettre l'affichage des topos.
     */

    @RequestMapping("/topos")
    public String affichageTopo(Model model) {

        model.addAttribute("topos", topoDao.findAll());

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        model.addAttribute("user", username);

        return "topos";
    }

    /**
     * Méthode qui va permettre la reservation d'un topo.
     */
    @RequestMapping(value = "/reservation/{id}", method = RequestMethod.GET)
    public String reservation(@PathVariable("id") Long id) {

        //on rend la reservation indisponible
        Topo topo = topoDao.findById(id).get();
        topo.setDisponibilite(true);

        //on recup le mail du demandeur de reservation dans topo
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        User user = userDao.findByUsername(username);
        String email = user.getEmail();
        topo.setBookingUser(email);

        topoDao.save(topo);

        return "redirect:/topos";

    }




}
