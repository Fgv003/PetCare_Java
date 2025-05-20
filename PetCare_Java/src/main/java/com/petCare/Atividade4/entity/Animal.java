package com.petCare.Atividade4.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @JsonBackReference
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

    @OneToMany()
    @JoinColumn(name = "animal")
    @JsonManagedReference
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

    public void setId(Long id) {
        this.id = id;
    }

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
