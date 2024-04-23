package com.example.encf.entities;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Gare {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;

    private String Ville;

    public Gare() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        Ville = ville;
    }

    @OneToMany(mappedBy = "gare")
    private List<Arret> arrets = new ArrayList<>();

    public Gare(long id, String nom, String ville) {
        this.id = id;
        this.nom = nom;
        Ville = ville;
    }
}
