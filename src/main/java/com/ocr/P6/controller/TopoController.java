package com.ocr.P6.controller;

import com.ocr.P6.dao.TopoDao;
import com.ocr.P6.dao.UserDao;
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
public class TopoController {

    @Autowired
    public JavaMailSender emailSender;

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

    /**
     * Méthode qui garde le topo reservé si le propriétaire accepte
     */

    @RequestMapping(value = "/reservation/valider/{id}", method = RequestMethod.GET)
    public String reservationValider (@PathVariable("id") Long id){


        Topo topo = topoDao.findById(id).get();
        envoiEmail(topo);

        return "redirect:/dashboard";

}

    /**
     * Méthode qui garde le topo disponible si le propriétaire refuse.
     */

    @RequestMapping(value = "/reservation/annuler/{id}", method = RequestMethod.GET)
    public String reservationAnnuler (@PathVariable("id") Long id){

        Topo topo = topoDao.findById(id).get();
        topo.setDisponibilite(false);
        topo.setBookingUser("null");
        topoDao.save(topo);

        return "redirect:/dashboard";

    }

    /**
     * Méthode qui va permettre l'envoi d'un email.
     */

    @RequestMapping(value = "/envoiEmail", method = RequestMethod.GET)
    public void envoiEmail(Topo topo){

        SimpleMailMessage message = new SimpleMailMessage();
        String emailBookingUser = topo.getBookingUser();
        message.setTo(emailBookingUser);
        message.setSubject("Reservation Topo");
        User user = topo.getUser();
        String emailProprietaireTopo = user.getEmail();
        message.setText("Hello,\n Votre reservation à été accepté veuillez contacter le proprietaire du topo par email que voici : " + emailProprietaireTopo + ".\n Amusez vous bien ! \n L'équipe AmisEscalade");
        this.emailSender.send(message);

    }


}
