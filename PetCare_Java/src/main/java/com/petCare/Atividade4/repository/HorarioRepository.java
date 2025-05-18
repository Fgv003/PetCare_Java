package com.petCare.Atividade4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petCare.Atividade4.entity.Horario;

public interface HorarioRepository extends JpaRepository<Horario, Long> {
}