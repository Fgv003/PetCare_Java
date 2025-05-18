package com.petCare.Atividade4.dtos;

import lombok.Data;

@Data
public class EnderecoDTO {
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
}