package com.spring1.models.entities;

import javax.persistence.*;
import java.io.Serializable;


// untuk model tablenya=================================================================

@Entity
@Table(name = "penugasan")
public class Penugasan implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "deskripsi", length = 200)
    private String deskripsi;

    public Penugasan() {
    }

    public Penugasan(Long id, String deskripsi) {
        this.id = id;
        this.deskripsi = deskripsi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    
}
