package com.petCare.Atividade4.services;

import com.petCare.Atividade4.entity.Tutor;
import java.util.List;

public interface TutorService {
    Tutor save(Tutor tutor);
    Tutor findById(Long id);
    List<Tutor> findAll();
    void deleteById(Long id);
}