package com.petCare.Atividade4.services;

import com.petCare.Atividade4.entity.Horario;
import com.petCare.Atividade4.repository.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class HorarioServiceImpl implements HorarioService {

    @Autowired
    private HorarioRepository horarioRepository;

    @Override
    public Horario save(Horario horario) {
        return horarioRepository.save(horario);
    }

    @Override
    public List<Horario> findByMedicoId(Long medicoId) {
        return horarioRepository.findByMedicoId(medicoId);
    }

    @Override
    public boolean existsByDataHoraAndMedicoId(LocalDateTime dataHora, Long medicoId) {
        return horarioRepository.existsByDataHoraAndMedicoId(dataHora, medicoId);
    }
}