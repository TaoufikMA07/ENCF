package com.example.encf.entities;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Ligne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id ;
    public Date date_depart;

    public Date date_arrivee;

    public String nom_de_ligne;


    public Ligne() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(Date date_depart) {
        this.date_depart = date_depart;
    }

    public Date getDate_arrivee() {
        return date_arrivee;
    }

    public void setDate_arrivee(Date date_arrivee) {
        this.date_arrivee = date_arrivee;
    }

    @OneToMany(mappedBy = "ligne")
    public List<Arret> arrets = new ArrayList<>();

    public Ligne(Long id, Date date_depart, Date date_arrivee, String nom_de_ligne) {
        this.id = id;
        this.date_depart = date_depart;
        this.date_arrivee = date_arrivee;
        this.nom_de_ligne = nom_de_ligne;
    }

    public String getNom_de_ligne() {
        return nom_de_ligne;
    }

    public void setNom_de_ligne(String nom_de_ligne) {
        this.nom_de_ligne = nom_de_ligne;
    }
}
