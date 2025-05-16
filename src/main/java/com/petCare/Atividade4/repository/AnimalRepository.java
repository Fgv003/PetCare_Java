package com.petCare.Atividade4.repository;

import com.petCare.Atividade4.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
