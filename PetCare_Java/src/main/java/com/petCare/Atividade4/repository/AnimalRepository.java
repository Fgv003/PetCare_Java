package com.petCare.Atividade4.repository;

import com.petCare.Atividade4.entity.Animal;

import java.util.List;

import com.petCare.Atividade4.entity.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
    List<Animal> findByIdTutor(Tutor tutor);
}
