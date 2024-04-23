package com.example.encf.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "Ordre-gare")
public class Arret {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Gare gare;

    @ManyToOne
    private Ligne ligne;

    private int ordre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Gare getGare() {
        return gare;
    }

    public void setGare(Gare gare) {
        this.gare = gare;
    }

    public Ligne getLigne() {
        return ligne;
    }

    public void setLigne(Ligne ligne) {
        this.ligne = ligne;
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    public Arret(Long id, Gare gare, Ligne ligne, int ordre) {
        this.id = id;
        this.gare = gare;
        this.ligne = ligne;
        this.ordre = ordre;
    }
}
