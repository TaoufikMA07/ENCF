package com.example.encf.services;

import com.example.encf.entities.*;
import com.example.encf.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import java.util.List;

@Service
public class LigneService {

    @Autowired
    private LigneRepository ligneRepository;

    public  Ligne createLigne( Ligne gare) {
        return ligneRepository.save(gare);
    }

    public List< Ligne> getAllLignes() {
        return ligneRepository.findAll();
    }

    public  Ligne getLigneById(Long id) {
        return ligneRepository.findById(id).orElse(null);
    }

    public  Ligne updateLigner(Long id,  Ligne gare) {
        gare.setId(id);
        return ligneRepository.save(gare);
    }

    public void deleteLigne(Long id) {
        ligneRepository.deleteById(id);
    }
}