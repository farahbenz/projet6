package com.ocr.P6.model;

import javax.persistence.*;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "statut_reservation", nullable = false)
    private Boolean statutReservation;

    @OneToOne
    @JoinColumn
    private User user;

    @OneToOne
    private Topo topo;

    private String email;

    public Booking(Boolean statutReservation, User user, Topo topo) {
        this.statutReservation = statutReservation;
        this.user = user;
        this.topo = topo;
    }

    public Booking() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getStatutReservation() {
        return statutReservation;
    }

    public void setStatutReservation(Boolean statutReservation) {
        this.statutReservation = statutReservation;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
