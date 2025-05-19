package com.petCare.Atividade4.services;

import com.petCare.Atividade4.entity.Endereco;
import com.petCare.Atividade4.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public Endereco save(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    @Override
    public Endereco findById(Long id) {
        return enderecoRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        enderecoRepository.deleteById(id);
    }
}