package com.example.ExerciceEntretien.controller;

import com.example.ExerciceEntretien.entity.Sondage;
import com.example.ExerciceEntretien.repository.SondageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sondages")
public class SondageController {
    @Autowired
    private SondageRepository sondageRepository;


    @PostMapping
    public Sondage creerSondage(@RequestBody Sondage sondage) {
        return sondageRepository.save(sondage);
    }

    @PostMapping
    public Sondage repondreSondage(@RequestBody Sondage sondage) {
        return sondageRepository.save(sondage);
    }
}
