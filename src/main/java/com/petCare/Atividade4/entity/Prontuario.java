package com.petCare.Atividade4.entity;

import java.time.LocalDateTime;
import java.util.List;

public class Prontuario {

    private Long id;
    private Long idMedico;
    private Long idTutor;
    private Animal animal;
    private String observacoes;
    private List<Vacina> historicoVacinas;
    private LocalDateTime horarioConsulta;
    private Integer salaConsulta;

    public Prontuario(Animal animal, LocalDateTime horarioConsulta,
                      Long id, Long idMedico, Long idTutor, Integer salaConsulta) {
        this.animal = animal;
        this.horarioConsulta = horarioConsulta;
        this.id = id;
        this.idMedico = idMedico;
        this.idTutor = idTutor;
        this.salaConsulta = salaConsulta;
    }

    public LocalDateTime getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(LocalDateTime horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdMedico() {
        return idMedico;
    }


    public Long getIdTutor() {
        return idTutor;
    }


    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Integer getSalaConsulta() {
        return salaConsulta;
    }

    public void setSalaConsulta(Integer salaConsulta) {
        this.salaConsulta = salaConsulta;
    }
}
