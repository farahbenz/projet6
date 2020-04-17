package com.ocr.P6.model;
import javax.persistence.*;


@Entity
@Table(name = "role")
public class Role {

    @Id
    private String role;


    public Role(String role) {
        this.role = role;

    }

    public Role() {
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
