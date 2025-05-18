package com.petCare.Atividade4.dtos;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class ProntuarioDTO {
    private Long idMedico;
    private Long idTutor;
    private Long idAnimal;
    private String observacao;
    private List<Long> vacinasIds;
    private LocalDate horarioConsulta;
    private Integer salaConsulta;
}

