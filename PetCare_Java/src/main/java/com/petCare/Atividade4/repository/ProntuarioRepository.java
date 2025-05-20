package com.petCare.Atividade4.repository;

import com.petCare.Atividade4.entity.Animal;
import com.petCare.Atividade4.entity.Medico;
import com.petCare.Atividade4.entity.Prontuario;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProntuarioRepository extends JpaRepository<Prontuario, Long> {

    boolean existsByMedicoAndHorarioConsulta(Medico medico, LocalDate horarioConsulta);
    List<Prontuario> findByAnimal(Animal animal);
}
