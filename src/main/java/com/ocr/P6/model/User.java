package com.ocr.P6.model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", nullable = false, unique = true)
    private Long idUser;

    @Column(name="name", nullable = false, unique = true)
    private String name;

    @Column(name="email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false,unique = true)
    private String password;

    public User(String name, String email, String password) {
    }

    public User() {

    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
