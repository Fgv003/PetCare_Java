package com.petCare.Atividade4.services;

import com.petCare.Atividade4.entity.Medico;
import java.util.List;

public interface MedicoService {
    Medico save(Medico medico);
    Medico findById(Long id);
    List<Medico> findAll();
    List<Medico> findByEspecialidade(String especialidade);
}