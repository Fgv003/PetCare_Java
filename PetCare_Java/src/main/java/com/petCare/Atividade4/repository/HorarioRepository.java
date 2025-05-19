package com.petCare.Atividade4.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petCare.Atividade4.entity.Horario;

public interface HorarioRepository extends JpaRepository<Horario, Long> {
    List<Horario> findByMedicoId(Long medicoId);
    boolean existsByDataHoraAndMedicoId(LocalDateTime dataHora, Long medicoId);
}