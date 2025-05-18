package com.petCare.Atividade4.dtos;

import java.time.LocalDate;

import com.petCare.Atividade4.entity.Especie;

import lombok.Data;

@Data
public class AnimalDTO {
    private Long tutorId;
    private String nome;
    private Especie especie;
    private Long racaId;
    private LocalDate dataNascimento;
}
