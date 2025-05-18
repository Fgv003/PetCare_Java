package com.petCare.Atividade4.dtos;

import lombok.Data;
import java.util.List;

@Data
public class TutorDTO {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private EnderecoDTO endereco;
    private List<AnimalDTO> animais;
}
