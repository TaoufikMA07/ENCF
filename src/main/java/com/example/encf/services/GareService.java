package com.example.encf.services;

import com.example.encf.entities.*;
import com.example.encf.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GareService {

    @Autowired
    private GareRepository gareRepository;

    public  Gare createGare( Gare gare) {
        return gareRepository.save(gare);
    }

    public List< Gare> getAlGares() {
        return gareRepository.findAll();
    }

    public  Gare getGareById(Long id) {
        return gareRepository.findById(id).orElse(null);
    }

    public  Gare updateGare(Long id,  Gare gare) {
        gare.setId(id);
        return gareRepository.save(gare);
    }

    public void deleteGare(Long id) {
        gareRepository.deleteById(id);
    }
}