package com.petCare.Atividade4.services;

import com.petCare.Atividade4.entity.Endereco;

public interface EnderecoService {
    Endereco save(Endereco endereco);
    Endereco findById(Long id);
    void deleteById(Long id);
}