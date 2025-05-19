package com.petCare.Atividade4.services;

import com.petCare.Atividade4.entity.Animal;
import com.petCare.Atividade4.entity.Tutor;
import com.petCare.Atividade4.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public Animal save(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public Animal findById(Long id) {
        return animalRepository.findById(id).orElse(null);
    }

    @Override
    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    @Override
    public List<Animal> findByIdTutor(Tutor tutor) {
        return animalRepository.findByIdTutor(tutor);
    }

    @Override
    public void deleteById(Long id) {
        animalRepository.deleteById(id);
    }

    @Override
    public List<Animal> findByIdTutor(Long tutorId) {
        Tutor tutor = new Tutor();
        tutor.setId(tutorId);
        return animalRepository.findByIdTutor(tutor);
    }
}