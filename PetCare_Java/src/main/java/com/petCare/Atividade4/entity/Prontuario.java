package com.petCare.Atividade4.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Prontuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "tutor_id")
    private Tutor tutor;

    @ManyToOne
    @JoinColumn(name = "animal_id")
    @JsonBackReference
    private Animal animal;

    private String observacoes;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Vacina> historicoVacinas;

    private LocalDateTime horarioConsulta;

    private Integer salaConsulta;

    // Construtores
    public Prontuario() {}

    public Prontuario(Animal animal, LocalDateTime horarioConsulta,
                      Long id, Medico medico, Tutor tutor, Integer salaConsulta) {
        this.animal = animal;
        this.horarioConsulta = horarioConsulta;
        this.id = id;
        this.medico = medico;
        this.tutor = tutor;
        this.salaConsulta = salaConsulta;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public List<Vacina> getHistoricoVacinas() {
        return historicoVacinas;
    }

    public void setHistoricoVacinas(List<Vacina> historicoVacinas) {
        this.historicoVacinas = historicoVacinas;
    }

    public LocalDateTime getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(LocalDateTime horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

    public Integer getSalaConsulta() {
        return salaConsulta;
    }

    public void setSalaConsulta(Integer salaConsulta) {
        this.salaConsulta = salaConsulta;
    }
}
