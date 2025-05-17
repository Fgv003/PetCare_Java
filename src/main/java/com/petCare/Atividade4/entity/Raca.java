package com.petCare.Atividade4.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_raca")
public class Raca {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Especie especie;
    private List<String> raca;

    public Raca() {}

    public Raca(Especie especie, List<String> raca) {
        this.especie = especie;
        this.raca = raca;
    }

}
