package com.petCare.Atividade4.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Medico extends Usuario{

    private String especialidade;
    @OneToMany(mappedBy = "medico")
    private List<Horario> horariosDisponiveis;
    @OneToMany(mappedBy = "idMedico")
    private List<Prontuario> consultasRealizadas;

    public Medico() {
    }

    public Medico(Long id, String nome, String email, String telefone, String CPF, String especialidade, Endereco endereco) {
        super(id, nome, email, telefone, CPF,endereco);
        this.especialidade = especialidade;
    }


    public String getEspecialidade() {
        return especialidade;
    }

}
