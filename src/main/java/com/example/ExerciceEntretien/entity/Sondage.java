package com.example.ExerciceEntretien.entity;

import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

public class Sondage {

    @Id
    @GeneratedValue
    private Long id;

    private String question;
}
