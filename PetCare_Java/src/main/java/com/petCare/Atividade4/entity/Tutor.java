package com.petCare.Atividade4.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Tutor extends Usuario {

    @OneToMany(mappedBy = "idTutor")
    private List<Animal> animalList;


    //public Tutor(Long id, String nome, String email, String telefone, String CPF, Endereco endereco) {
      //  super(id, nome, email, telefone, CPF, endereco);
    //}
    


}
