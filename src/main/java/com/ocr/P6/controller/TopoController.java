package com.ocr.P6.controller;

import com.ocr.P6.dao.BookingDao;
import com.ocr.P6.dao.TopoDao;
import com.ocr.P6.dao.UserDao;
import com.ocr.P6.model.Booking;
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

    @Autowired
    private BookingDao bookingDao;


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
    public String reservation(@PathVariable("id") Long id, Booking booking) {

        //on rend la reservation reservé
        booking.setStatutReservation(true);
        bookingDao.save(booking);


        //on recup le nom du demandeur de reservation dans booking
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        User user = userDao.findByUsername(username);
        booking.setUser(user);

        //on recupere l'email du demandeur de reservation dans booking
        String email = user.getEmail();
        booking.setEmail(email);


        //on recup l'id du topo qui est reservé
        Topo topo = topoDao.findById(id).get();
        booking.setTopo(topo);

        //on save
        bookingDao.save(booking);

        //on rend le topo indisponible
        if (booking.getStatutReservation()== true){
            topo.setDisponibilite(true);
        }

        //on ajoute l'id booking au topo
        Booking booking1 = bookingDao.findById(id).get();
        topo.setBooking(booking1);

        //on save
        topoDao.save(topo);

        return "redirect:/topos";

    }

    /**
     * Méthode qui garde le topo reservé si le propriétaire de accepte et envoi un mail automatique pour l'échange de coordonnée.
     */

    @RequestMapping(value = "/validite/{id}", method = RequestMethod.GET)
    public String resaValidite (@PathVariable("id") Long id, Booking booking){
        Topo topo = topoDao.findById(id).get();
        topo.setDisponibilite(true);
        topoDao.save(topo);


        // Create a Simple MailMessage.
        SimpleMailMessage message = new SimpleMailMessage();
        Booking booking1 = topo.getBooking();
        String email = booking1.getEmail();
        message.setTo(email);
        message.setSubject("Reservation Topo");
        User user = topo.getUser();
        String emailTopo = user.getEmail();
        message.setText("Hello,\n Votre reservation à été accepté veuillez contacter le proprietaire du topo par email que voici : " + emailTopo + ".\n Amusez vous bien ! \n L'équipe AmisEscalade");

        // Send Message!
        this.emailSender.send(message);

        return "dashboard";
}

    /**
     * Méthode qui garde le topo disponible si le propriétaire de refuse.
     */

    @RequestMapping(value = "/validiteNul/{id}", method = RequestMethod.GET)
    public String resaValiditeNul (@PathVariable("id") Long id){
        Topo topo = topoDao.findById(id).get();
        topo.setDisponibilite(false);
        topoDao.save(topo);
        return "dashboard";
    }


    /**
     * Methode qui va permettre d'afficher le tableau de chaque utilisateur connecté
     */

    @RequestMapping("/dashboard")
    public String affichage(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        model.addAttribute("topos", topoDao.findToposByUserUsername(username));


        return "dashboard";
    }







}
