package com.ocr.P6.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "spot")
public class Spot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_spot", nullable = false, unique = true)
    private Long idSpot;

    @Column(name = "nom", nullable = false, unique = true)
    private String nom;
    private String secteur;
    private String type;
    private String hauteur;
    private String orientation;
    @Column(name = "nombre_de_voies", nullable = false)
    private String nombreDeVoies;
    private String cotation;
    @Column(name = "coordonee_geo", nullable = false, unique = true)
    private String coordoneeGeo;

    @ManyToOne
    @JoinColumn(name="idUser")
    private User user;

    @OneToMany (mappedBy = "spot")
    private List<Comment> comments;


    public Spot(String nom, String secteur, String type, String hauteur, String orientation, String nombreDeVoies, String cotation, String coordoneeGeo) {
        this.nom = nom;
        this.secteur = secteur;
        this.type = type;
        this.hauteur = hauteur;
        this.orientation = orientation;
        this.nombreDeVoies = nombreDeVoies;
        this.cotation = cotation;
        this.coordoneeGeo = coordoneeGeo;
    }

    public Spot() {
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

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
