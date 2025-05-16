package com.petCare.Atividade4.repository;

import com.petCare.Atividade4.entity.Prontuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProntuarioRepository extends JpaRepository<Prontuario, Long> {
}
