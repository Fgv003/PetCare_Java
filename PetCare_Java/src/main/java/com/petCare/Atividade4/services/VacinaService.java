package com.petCare.Atividade4.services;

import com.petCare.Atividade4.entity.Vacina;
import java.util.List;

public interface VacinaService {
    Vacina save(Vacina vacina);
    Vacina findById(Long id);
    List<Vacina> findAll();
    List<Vacina> findByProntuarioId(Long prontuarioId);
}