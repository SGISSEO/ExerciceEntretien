package com.example.ExerciceEntretien.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToOne;
import org.springframework.data.annotation.Id;

public class Reponse {


    @Id
    @GeneratedValue
    private Long id;

    private String choix;

    @ManyToOne
    private Sondage sondage;
}
