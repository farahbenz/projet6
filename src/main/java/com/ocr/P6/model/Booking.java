package com.ocr.P6.model;

import javax.persistence.*;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatutReservation() {
        return statutReservation;
    }

    public void setStatutReservation(String statutReservation) {
        this.statutReservation = statutReservation;
    }
}
