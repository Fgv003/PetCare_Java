package com.petCare.Atividade4.dtos;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class HorarioDTO {
    private LocalDateTime dataHora;
    private Boolean disponivel;
}