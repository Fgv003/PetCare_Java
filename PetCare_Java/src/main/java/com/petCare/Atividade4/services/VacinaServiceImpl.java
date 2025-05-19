package com.petCare.Atividade4.services;

import com.petCare.Atividade4.entity.Vacina;
import com.petCare.Atividade4.repository.VacinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VacinaServiceImpl implements VacinaService {

    @Autowired
    private VacinaRepository vacinaRepository;

    @Override
    public Vacina save(Vacina vacina) {
        return vacinaRepository.save(vacina);
    }

    @Override
    public Vacina findById(Long id) {
        return vacinaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Vacina> findAll() {
        return vacinaRepository.findAll();
    }

    @Override
    public List<Vacina> findByProntuarioId(Long prontuarioId) {
        return vacinaRepository.findByProntuarioId(prontuarioId);
    }
}