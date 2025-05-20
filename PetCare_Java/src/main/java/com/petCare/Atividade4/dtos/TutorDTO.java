package com.petCare.Atividade4.dtos;

import com.petCare.Atividade4.entity.Endereco;
import lombok.Data;
import java.util.List;

@Data
public class TutorDTO {

    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private Endereco endereco;
    private List<AnimalDTO> animais;
}
