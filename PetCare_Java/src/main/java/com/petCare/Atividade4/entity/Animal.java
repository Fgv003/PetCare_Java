package com.petCare.Atividade4.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "tutor_id")
    private Tutor idTutor;
    public Tutor getIdTutor() {
    return idTutor;
}
    private String nome;
    private Especie especie;
    @ManyToOne
    @JoinColumn(name = "raca_id")
    private Raca raca;
    private LocalDateTime dataNascimento;

    @OneToMany(mappedBy = "animal", cascade = CascadeType.ALL)
    private List<Prontuario> prontuarios;

    public List<Prontuario> getProntuarios() {
    return prontuarios;
}


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



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
