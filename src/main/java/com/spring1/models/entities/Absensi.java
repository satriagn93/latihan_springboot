package com.spring1.models.entities;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

// untuk model tablenya=================================================================

@Entity
@Table(name = "report_absensi")
public class Absensi implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "alasan", length = 200)
    private String alasan;

    @Column(name="type", length = 50)
    private String type;

    @Column(name="latitude", length = 50)
    private String latitude;

    @Column(name="longitude", length = 50)
    private String longitude;

    @Column(name="photo_url", length = 200)
    private String photo_url;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_penugasan_id")
    private Penugasan penugasan;

    public Absensi() {
    }

    public Absensi(Long id, String alasan, String type, String latitude, String longitude, String photo_url ) {
        this.id = id;
        this.alasan = alasan;
        this.type = type;
        this.latitude = latitude;
        this.longitude = longitude;
        this.photo_url = photo_url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlasan() {
        return alasan;
    }

    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongtitude() {
        return longitude;
    }

    public void setLongtitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }

    public Penugasan getPenugasan() {
        return penugasan;
    }

    public void setPenugasan(Penugasan penugasan) {
        this.penugasan = penugasan;
    }

    
    
}
