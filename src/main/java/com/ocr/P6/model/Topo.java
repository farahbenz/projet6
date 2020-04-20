package com.ocr.P6.model;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Topo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom", nullable = false, unique = true)
    private String nom;
    private String description;
    private String region;
    private Boolean disponibilite = false;
    @UpdateTimestamp
    @Temporal(TemporalType.DATE)
    private Date dateParution;

    @ManyToOne
    private User user;

    private String bookingUser;

    public Topo(String nom, String description, String region, Boolean disponibilite, Date dateParution) {
        this.nom = nom;
        this.description = description;
        this.region = region;
        this.disponibilite = disponibilite;
        this.dateParution = dateParution;
    }

    public Topo(String nom, String description, String region, Boolean disponibilite, Date dateParution, User user) {
        this.nom = nom;
        this.description = description;
        this.region = region;
        this.disponibilite = disponibilite;
        this.dateParution = dateParution;
        this.user = user;
    }

    public Topo() {
    }

    public String getBookingUser() {
        return bookingUser;
    }

    public void setBookingUser(String bookingUser) {
        this.bookingUser = bookingUser;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRegion() {
        return region;
    }

    public Boolean getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(Boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    public Date getDateParution() {
        return dateParution;
    }

}
