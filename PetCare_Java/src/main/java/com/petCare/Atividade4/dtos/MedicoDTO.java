package com.petCare.Atividade4.dtos;


import com.petCare.Atividade4.dtos.HorarioDTO;
import com.petCare.Atividade4.entity.Endereco;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicoDTO {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private String especializacao;
    private Endereco endereco;
    private List<HorarioDTO> horariosDisponiveis;

}
