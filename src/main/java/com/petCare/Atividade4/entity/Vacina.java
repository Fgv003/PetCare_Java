package com.petCare.Atividade4.entity;

import java.time.LocalDateTime;

public class Vacina {

    private Long idVacina;
    private String nomeVacina;
    private LocalDateTime dataAplicacao;

    public Vacina(LocalDateTime dataAplicacao, Long idVacina, String nomeVacina) {
        this.dataAplicacao = dataAplicacao;
        this.idVacina = idVacina;
        this.nomeVacina = nomeVacina;
    }

    public Vacina(Long idVacina, String nomeVacina) {
        this.idVacina = idVacina;
        this.nomeVacina = nomeVacina;
    }


    public LocalDateTime getDataAplicacao() {
        return dataAplicacao;
    }

    public Long getIdVacina() {
        return idVacina;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

}
