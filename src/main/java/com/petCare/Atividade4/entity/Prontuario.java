package com.petCare.Atividade4.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Prontuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(mappedBy = "id")
    private Medico idMedico;
    @OneToOne(mappedBy = "id")
    private Tutor idTutor;
    @OneToOne()
    private Animal animal;
    private String observacoes;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Vacina> historicoVacinas;
    private LocalDateTime horarioConsulta;
    private Integer salaConsulta;

    public Prontuario(Animal animal, LocalDateTime horarioConsulta,
                      Long id, Medico idMedico, Tutor idTutor, Integer salaConsulta) {
        this.animal = animal;
        this.horarioConsulta = horarioConsulta;
        this.id = id;
        this.idMedico = idMedico;
        this.idTutor = idTutor;
        this.salaConsulta = salaConsulta;
    }

    public Prontuario() {}

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

    public Medico getIdMedico() {
        return idMedico;
    }


    public Tutor getIdTutor() {
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
