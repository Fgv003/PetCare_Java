package com.petCare.Atividade4.services;

import com.petCare.Atividade4.entity.Tutor;
import com.petCare.Atividade4.repository.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TutorServiceImpl implements TutorService {

    @Autowired
    private TutorRepository tutorRepository;

    @Override
    public Tutor save(Tutor tutor) {
        return tutorRepository.save(tutor);
    }

    @Override
    public Tutor findById(Long id) {
        return tutorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Tutor> findAll() {
        return tutorRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        tutorRepository.deleteById(id);
    }
}