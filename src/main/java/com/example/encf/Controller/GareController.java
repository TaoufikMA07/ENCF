package com.example.encf.Controller;

import com.example.encf.entities.*;
import com.example.encf.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gares")
public class GareController {

    @Autowired
    private GareService gareService;

    @GetMapping
    public List<Gare> getAllGares() {
        return gareService.getAlGares();
    }

    @GetMapping("/{id}")
    public Gare getGareById(@PathVariable("id") Long id) {

        return gareService.getGareById(id);
    }

    @PostMapping
    public void createGare(@RequestBody Gare gare) {
        Gare createdGare = gareService.createGare(gare);
    }

    @DeleteMapping("/{id}")
    public void deleteGare(@PathVariable("id") Long id) {
        gareService.deleteGare(id);

    }
}