package com.petCare.Atividade4.dtos;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HorarioDTO {
    private LocalDateTime dataHora;
    private Boolean disponivel;

}