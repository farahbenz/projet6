package com.ocr.P6.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "spot")
public class Spot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String secteur;
    private String type;
    private String hauteur;
    private String orientation;
    @Column(name = "nombre_de_voies")
    private String nombreDeVoies;
    private String cotation;
    @Column(name = "coordonee_geo")
    private String coordoneeGeo;
    private boolean tag;

    @ManyToOne
    private User user;

    @OneToMany (mappedBy = "spot")
    private List<Comment> comments;



    public Spot() {
    }

    public Spot(String nom, String secteur, String type, String hauteur, String orientation, String nombreDeVoies, String cotation, String coordoneeGeo, boolean tag, User user, List<Comment> comments) {
        this.nom = nom;
        this.secteur = secteur;
        this.type = type;
        this.hauteur = hauteur;
        this.orientation = orientation;
        this.nombreDeVoies = nombreDeVoies;
        this.cotation = cotation;
        this.coordoneeGeo = coordoneeGeo;
        this.tag = tag;
        this.user = user;
        this.comments = comments;
    }

    public Spot(String nom, String type) {
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

    public boolean isTag() {
        return tag;
    }

    public void setTag(boolean tag) {
        this.tag = tag;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
