package com.ocr.P6.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class User implements Serializable {


    private boolean actived = true;
    @Id
    private String username;
    private String email;
    private String password;


    @ManyToMany
    @JoinTable(name = "USER_ROLE")
    private Collection<Role> roles;


    public User(boolean actived, String username, String email, String password) {
        this.actived = actived;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User() {
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
