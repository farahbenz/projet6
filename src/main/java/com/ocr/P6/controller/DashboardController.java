package com.ocr.P6.controller;

import com.ocr.P6.dao.TopoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {

    @Autowired
    private TopoDao topoDao;

    /**
     * Methode qui va permettre d'afficher le tableau de bord de chaque utilisateur connecté
     */

    @RequestMapping("/dashboard")
    public String affichageDashboard(Model model) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        model.addAttribute("topos", topoDao.findToposByUserUsername(username));

        return "dashboard";
    }
}
