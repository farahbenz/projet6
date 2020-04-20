package com.ocr.P6.model;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String commentaire;

    private String auteur;

    @UpdateTimestamp
    @Temporal(TemporalType.DATE)
    private Date dateParution;

    @ManyToOne
    @JoinColumn(name = "idSpot")
    private Spot spot;

    public Comment(String commentaire, String auteur, Date dateParution, Spot spot) {
        this.commentaire = commentaire;
        this.auteur = auteur;
        this.dateParution = dateParution;
        this.spot = spot;
    }

    public Comment() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Date getDateParution() {
        return dateParution;
    }

    public Spot getSpot() {
        return spot;
    }

    public void setSpot(Spot spot) {
        this.spot = spot;
    }
}
