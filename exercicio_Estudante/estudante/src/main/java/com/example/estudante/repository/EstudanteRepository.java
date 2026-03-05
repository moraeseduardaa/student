package com.example.estudante.repository;

import com.example.estudante.models.EstudanteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository <EstudanteModel, Long> {
}
