package com.petCare.Atividade4.services;

import com.petCare.Atividade4.entity.Animal;
import com.petCare.Atividade4.entity.Tutor;
import java.util.List;

public interface AnimalService {
    Animal save(Animal animal); 
    Animal findById(Long id); 
    List<Animal> findAll(); 
    List<Animal> findByIdTutor(Tutor tutor); 
    void deleteById(Long id); 
    List<Animal> findByIdTutor(Long tutorId);
}