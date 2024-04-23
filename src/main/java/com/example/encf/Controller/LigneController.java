package com.example.encf.Controller;

import com.example.encf.entities.*;
import com.example.encf.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ligne")
public class LigneController {

    @Autowired
    private LigneService ligneService;

    @GetMapping
    public List<Ligne> getAllLignes() {
        return ligneService.getAllLignes();
    }

    @GetMapping("/{id}")
    public  Ligne getLigneById(@PathVariable("id") Long id) {

        return ligneService.getLigneById(id);
    }

    @PostMapping
    public void createLigne(@RequestBody Ligne ligne) {
        Ligne createdLigne = ligneService.createLigne(ligne);
    }

    @DeleteMapping("/{id}")
    public void deleteLigne(@PathVariable("id") Long id) {
        ligneService.deleteLigne(id);
    }
}