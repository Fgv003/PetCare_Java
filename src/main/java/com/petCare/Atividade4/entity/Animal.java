package com.petCare.Atividade4.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(mappedBy = "id")
    private Tutor idTutor;
    private String nome;
    private Especie especie;
    @OneToOne
    private Raca raca;
    private LocalDateTime dataNascimento;

    public Animal(LocalDateTime dataNascimento, Especie especie, Long id, Tutor
            idTutor, String nome, Raca raca) {
        this.dataNascimento = dataNascimento;
        this.especie= especie;
        this.id = id;
        this.idTutor = idTutor;
        this.nome = nome;
        this.raca = raca;
    }

    public Animal() {}

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public Long getId() {
        return id;
    }

    public Tutor getIdTutor() {
        return idTutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
