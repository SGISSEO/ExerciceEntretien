package com.example.ExerciceEntretien.controller;

import com.example.ExerciceEntretien.entity.Reponse;
import com.example.ExerciceEntretien.entity.Sondage;
import com.example.ExerciceEntretien.repository.ReponseRepository;
import com.example.ExerciceEntretien.repository.SondageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reponses")
public class ReponseController {
    @Autowired
    private ReponseRepository reponseRepository;


    @PostMapping
    public Reponse creerReponse(@RequestBody Reponse reponse) {
        return reponseRepository.save(reponse);
    }

}
