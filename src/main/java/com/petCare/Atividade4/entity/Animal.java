package com.petCare.Atividade4.entity;

import java.time.LocalDateTime;

public class Animal {

    private Long id;
    private Long idTutor;
    private String nome;
    private Especie especie;
    private Raca raca;
    private LocalDateTime dataNascimento;

    public Animal(LocalDateTime dataNascimento, Especie especie, Long id, Long
            idTutor, String nome, Raca raca) {
        this.dataNascimento = dataNascimento;
        this.especie= especie;
        this.id = id;
        this.idTutor = idTutor;
        this.nome = nome;
        this.raca = raca;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public Long getId() {
        return id;
    }

    public Long getIdTutor() {
        return idTutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
