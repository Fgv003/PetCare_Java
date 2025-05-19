package com.petCare.Atividade4.services;

import com.petCare.Atividade4.entity.Medico;
import com.petCare.Atividade4.entity.Prontuario;
import java.time.LocalDate;
import java.util.List;

public interface ProntuarioService {
    Prontuario save(Prontuario prontuario);
    Prontuario findById(Long id);
    List<Prontuario> findAll();
    boolean existsByIdMedicoAndHorarioConsulta(Medico medico, LocalDate data);
    List<Prontuario> findByAnimalId(Long animalId);
}