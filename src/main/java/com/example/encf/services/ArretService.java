package com.example.encf.services;

import com.example.encf.entities.*;
import com.example.encf.repositories.ArretRepository;
import com.example.encf.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArretService {

    @Autowired
    private ArretRepository arretRepository;

    public Arret saveArret(Arret arret) {
        return arretRepository.save(arret);
    }

    public List<Arret> getAllArrets() {
        return arretRepository.findAll();
    }



    public void deleteArret(Long id) {
        arretRepository.deleteById(id);
    }
}