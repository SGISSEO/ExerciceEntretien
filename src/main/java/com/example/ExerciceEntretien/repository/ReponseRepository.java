package com.example.ExerciceEntretien.repository;

import com.example.ExerciceEntretien.entity.Reponse;
import com.example.ExerciceEntretien.entity.Sondage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReponseRepository extends JpaRepository<Reponse, Long> {
}
