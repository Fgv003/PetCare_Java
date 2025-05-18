package com.petCare.Atividade4.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class Vacina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idVacina;
    private String nomeVacina;
    private LocalDateTime dataAplicacao;
    @ManyToOne
    @JoinColumn(name = "prontuario_id")
    private Prontuario prontuario;

    public Prontuario getProntuario() {
        return prontuario;
    }

    public Vacina(LocalDateTime dataAplicacao, Long idVacina, String nomeVacina) {
        this.dataAplicacao = dataAplicacao;
        this.idVacina = idVacina;
        this.nomeVacina = nomeVacina;
    }

    public Vacina(Long idVacina, String nomeVacina) {
        this.idVacina = idVacina;
        this.nomeVacina = nomeVacina;
    }

    public Vacina() {}


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
