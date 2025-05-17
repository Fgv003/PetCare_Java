package com.petCare.Atividade4.entity;

import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class Tutor extends Usuario {

    private List<Animal> animalList;

    public Tutor(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public Tutor(Long id, String nome, String email, String telefone, String CPF, Endereco endereco) {
        super(id, nome, email, telefone, CPF, endereco);
    }
    
    public Tutor() {
    }

}
