package com.petCare.Atividade4.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime dataHora;
    private boolean disponivel;

    public Horario(Long id, LocalDateTime dataHora, boolean disponivel) {
        this.id = id;
        this.dataHora = dataHora;
        this.disponivel = disponivel;
    }

    public Horario() {}

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public boolean isDisponivel() {
        return disponivel;
    }



}
