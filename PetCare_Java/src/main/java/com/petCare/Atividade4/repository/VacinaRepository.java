package com.petCare.Atividade4.repository;

import com.petCare.Atividade4.entity.Animal;
import com.petCare.Atividade4.entity.Vacina;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacinaRepository extends JpaRepository<Vacina, Long> {
    List<Vacina> findByProntuario_AnimalIn(List<Animal> animais);
}
