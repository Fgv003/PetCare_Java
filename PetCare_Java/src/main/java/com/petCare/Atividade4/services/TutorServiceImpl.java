package com.petCare.Atividade4.services;

import com.petCare.Atividade4.dtos.MedicoDTO;
import com.petCare.Atividade4.dtos.TutorDTO;
import com.petCare.Atividade4.entity.Endereco;
import com.petCare.Atividade4.entity.Horario;
import com.petCare.Atividade4.entity.Tutor;
import com.petCare.Atividade4.repository.EnderecoRepository;
import com.petCare.Atividade4.repository.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TutorServiceImpl implements TutorService {

    @Autowired
    private TutorRepository tutorRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public Tutor save(TutorDTO dto) {
        Endereco endereco = enderecoRepository.save(dto.getEndereco());

        Tutor tutor = new Tutor();
        tutor.setNome(dto.getNome());
        tutor.setTelefone(dto.getTelefone());
        tutor.setEmail(dto.getEmail());
        tutor.setCPF(dto.getCpf());
        tutor.setEndereco(endereco);
        tutor.setAnimalList(new ArrayList<>());

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