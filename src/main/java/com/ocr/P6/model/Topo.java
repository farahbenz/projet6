package com.ocr.P6.model;

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
    @Column(name = "etat_topo", nullable = false, unique = true)
    private String etatTopo;

    @Temporal(TemporalType.DATE)
    private Date dateParution;

    @ManyToOne
    @JoinColumn(name="idUser")
    private User user;

    @OneToOne
    private Booking booking;

    public Topo(String nom, String description, String region, String etatTopo, Date dateParution) {
        this.nom = nom;
        this.description = description;
        this.region = region;
        this.etatTopo = etatTopo;
        this.dateParution = dateParution;
    }

    public Topo() {
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

    public void setRegion(String region) {
        this.region = region;
    }

    public String getEtatTopo() {
        return etatTopo;
    }

    public void setEtatTopo(String etatTopo) {
        this.etatTopo = etatTopo;
    }

    public Date getDateParution() {
        return dateParution;
    }

    public void setDateParution(Date dateParution) {
        this.dateParution = dateParution;
    }

}
