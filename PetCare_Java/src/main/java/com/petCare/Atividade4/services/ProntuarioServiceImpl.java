package com.petCare.Atividade4.services;

import com.petCare.Atividade4.entity.Animal;
import com.petCare.Atividade4.entity.Medico;
import com.petCare.Atividade4.entity.Prontuario;
import com.petCare.Atividade4.repository.ProntuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class ProntuarioServiceImpl implements ProntuarioService {

    @Autowired
    private ProntuarioRepository prontuarioRepository;

    @Override
    public Prontuario save(Prontuario prontuario) {
        return prontuarioRepository.save(prontuario);
    }

    @Override
    public Prontuario findById(Long id) {
        return prontuarioRepository.findById(id).orElse(null);
    }

    @Override
    public List<Prontuario> findAll() {
        return prontuarioRepository.findAll();
    }

    @Override
    public boolean existsByIdMedicoAndHorarioConsulta(Medico medico, LocalDate data) {
        return prontuarioRepository.existsByMedicoAndHorarioConsulta(medico, data);
    }

    @Override
    public List<Prontuario> findByAnimalId(Long animalId) {
        Animal animal = new Animal();
        animal.setId(animalId); // Cria um animal apenas com o ID
        return prontuarioRepository.findByAnimal(animal); // Usa o método que já existe
    }
}