package com.petCare.Atividade4.services;

import com.petCare.Atividade4.entity.Horario;
import java.time.LocalDateTime;
import java.util.List;

public interface HorarioService {
    Horario save(Horario horario);
    List<Horario> findByMedicoId(Long medicoId);
    boolean existsByDataHoraAndMedicoId(LocalDateTime dataHora, Long medicoId);
}