package com.petCare.Atividade4.entity;

import java.time.LocalDateTime;

public class Horario {

    private LocalDateTime dataHora;
    private boolean disponivel;

    public Horario(LocalDateTime dataHora, boolean disponivel) {
        this.dataHora = dataHora;
        this.disponivel = disponivel;
    }


}
