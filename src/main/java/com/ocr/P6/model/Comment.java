package com.ocr.P6.model;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comment", nullable = false, unique = true)
    private Long idComment;
    private String commentaire;

    @ManyToOne
    @JoinColumn(name="idSpot")
    private Spot spot;

    public Comment(String commentaire) {
        this.commentaire = commentaire;
    }

    public Comment() {
    }

    public Long getIdComment() {
        return idComment;
    }

    public void setIdComment(Long idComment) {
        this.idComment = idComment;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
