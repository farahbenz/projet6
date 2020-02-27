package com.ocr.P6.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Topo {
    @Id
    @GeneratedValue
    private Long idTopo;
    private String nom;
    private String description;
    private String region;
    private String etatTopo;

    @Temporal(TemporalType.DATE)
    private Date dateParution;



    public Long getIdTopo() {
        return idTopo;
    }

    public void setIdTopo(Long idTopo) {
        this.idTopo = idTopo;
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
