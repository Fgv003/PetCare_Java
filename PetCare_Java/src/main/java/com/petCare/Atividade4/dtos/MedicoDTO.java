package com.petCare.Atividade4.dtos;

import java.util.List;

import lombok.Data;

@Data
public class MedicoDTO {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private EnderecoDTO endereco;
    private String especializacao;
    private List<HorarioDTO> horariosDisponiveis;
}
