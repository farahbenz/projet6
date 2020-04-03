package com.ocr.P6.model;
import javax.persistence.*;


@Entity
@Table(name = "role")
public class Role {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Id
    private String role;


    public Role(String role) {
        this.role = role;

    }

    public Role() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
