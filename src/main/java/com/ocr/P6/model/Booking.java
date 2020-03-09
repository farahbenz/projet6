package com.ocr.P6.model;

import javax.persistence.*;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    @Column(name = "statut_reservation", nullable = false)
    private String statutReservation;

    @ManyToOne
    @JoinColumn(name="idUser")
    private User user;

    public Booking(String statutReservation) {
        this.statutReservation = statutReservation;
    }

    public Booking() {
    }

    public Long getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public String getStatutReservation() {
        return statutReservation;
    }

    public void setStatutReservation(String statutReservation) {
        this.statutReservation = statutReservation;
    }
}
