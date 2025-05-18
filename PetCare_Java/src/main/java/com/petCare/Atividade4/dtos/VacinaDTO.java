package com.petCare.Atividade4.dtos;

import java.time.LocalDate;

import lombok.Data;

@Data
public class VacinaDTO {
    private String nomeVacina;
    private LocalDate dataAplicacao;
    private Long prontuarioId;
}
