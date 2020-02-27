package com.ocr.P6.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Spot {
    @Id
    @GeneratedValue

    private Long idSpot;
    private String secteur;
    private String type;
    private String hauteur;
    private String orientation;
    private String nombreDeVoies;
    private String cotation;
    private String coordoneeGeo;


    public Long getIdSpot() {
        return idSpot;
    }

    public void setIdSpot(Long idSpot) {
        this.idSpot = idSpot;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHauteur() {
        return hauteur;
    }

    public void setHauteur(String hauteur) {
        this.hauteur = hauteur;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getNombreDeVoies() {
        return nombreDeVoies;
    }

    public void setNombreDeVoies(String nombreDeVoies) {
        this.nombreDeVoies = nombreDeVoies;
    }

    public String getCotation() {
        return cotation;
    }

    public void setCotation(String cotation) {
        this.cotation = cotation;
    }

    public String getCoordoneeGeo() {
        return coordoneeGeo;
    }

    public void setCoordoneeGeo(String coordoneeGeo) {
        this.coordoneeGeo = coordoneeGeo;
    }
}
