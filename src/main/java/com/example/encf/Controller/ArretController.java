package com.example.encf.Controller;

import com.example.encf.entities.*;
import com.example.encf.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/arret")
public class ArretController {

    @Autowired
    private ArretService arretService;

    @GetMapping
    public List<Arret> getAllArrets() {
        return arretService.getAllArrets();
    }



    @PostMapping
    public void createArret(@RequestBody Arret arret) {
        Arret createdArret = arretService.saveArret(arret);
    }

    @DeleteMapping("/{id}")
    public void deleteArret(@PathVariable("id") Long id) {
        arretService.deleteArret(id);
    }
}