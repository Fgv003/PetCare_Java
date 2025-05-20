package com.petCare.Atividade4.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime dataHora;
    private boolean disponivel;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    @JsonBackReference
    private Medico medico;
    public Medico getMedico() {
    return medico;
    }

    public Horario(Long id, LocalDateTime dataHora, boolean disponivel) {
        this.id = id;
        this.dataHora = dataHora;
        this.disponivel = disponivel;
    }

    public Horario() {}

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
