package com.petCare.Atividade4.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.petCare.Atividade4.dtos.EnderecoDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Medico extends Usuario{

    private String especialidade;

    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Horario> horariosDisponiveis;
    @OneToMany(mappedBy = "idMedico")
    private List<Prontuario> consultasRealizadas;

    public Medico(Long id, String nome, String email, String telefone, String CPF, String especialidade, Endereco endereco) {
        super(id, nome, email, telefone, CPF,endereco);
        this.especialidade = especialidade;
    }

    public Medico() {
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public List<Horario> getHorariosDisponiveis() {
        return horariosDisponiveis;
    }
    public void setHorariosDisponiveis(List<Horario> horariosDisponiveis) {
        this.horariosDisponiveis = horariosDisponiveis;
    }


}