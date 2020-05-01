package com.ocr.P6.controller;

import com.ocr.P6.dao.TopoDao;
import com.ocr.P6.model.Topo;
import com.ocr.P6.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {

    @Autowired
    private TopoDao topoDao;

    @Autowired
    public JavaMailSender emailSender;

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

    /**
     * Méthode qui garde le topo reservé si le propriétaire accepte
     */

    @RequestMapping(value = "/reservation/valider/{id}", method = RequestMethod.GET)
    public String reservationValider (@PathVariable("id") Long id){

        Topo topo = topoDao.findById(id).get();
        topo.setEchangeEmail(true);
        topoDao.save(topo);
        envoiEmailValidation(topo);

        return "redirect:/dashboard";

    }

    /**
     * Méthode qui remet le topo disponible si le propriétaire refuse.
     */

    @RequestMapping(value = "/reservation/annuler/{id}", method = RequestMethod.GET)
    public String reservationAnnuler (@PathVariable("id") Long id){

        Topo topo = topoDao.findById(id).get();
        topo.setDisponibilite(false);
        topo.setEchangeEmail(false);
        envoiEmailRefus(topo);
        topo.setBookingUser("null");
        topoDao.save(topo);


        return "redirect:/dashboard";

    }

    /**
     * Méthode qui va permettre l'envoi d'un email de confirmation.
     */

    public void envoiEmailValidation(Topo topo){

        SimpleMailMessage message = new SimpleMailMessage();
        String emailBookingUser = topo.getBookingUser();
        message.setTo(emailBookingUser);
        message.setSubject("Reservation Topo");
        User user = topo.getUser();
        String emailProprietaireTopo = user.getEmail();
        message.setText("Hello,\n Votre reservation à été accepté veuillez contacter le proprietaire du topo par email que voici : " + emailProprietaireTopo + ".\n Amusez vous bien ! \n L'équipe AmisEscalade");
        this.emailSender.send(message);

    }

    /**
     * Méthode qui va permettre l'envoi d'un email.
     */

    public void envoiEmailRefus(Topo topo){

        SimpleMailMessage message1 = new SimpleMailMessage();
        String emailBookingUser = topo.getBookingUser();
        message1.setTo(emailBookingUser);
        message1.setSubject("Reservation Topo");
        message1.setText("Hello,\n Votre reservation à été refusé.\n À bientôt! \n L'équipe AmisEscalade");
        this.emailSender.send(message1);

    }
}
