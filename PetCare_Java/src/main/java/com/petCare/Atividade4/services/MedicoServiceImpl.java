package com.petCare.Atividade4.services;

import com.petCare.Atividade4.dtos.MedicoDTO;
import com.petCare.Atividade4.entity.Endereco;
import com.petCare.Atividade4.entity.Horario;
import com.petCare.Atividade4.entity.Medico;
import com.petCare.Atividade4.repository.EnderecoRepository;
import com.petCare.Atividade4.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MedicoServiceImpl implements MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public  Medico save(MedicoDTO dto) {
        Endereco endereco = enderecoRepository.save(dto.getEndereco());

        Medico medico = new Medico();
        medico.setNome(dto.getNome());
        medico.setTelefone(dto.getTelefone());
        medico.setEmail(dto.getEmail());
        medico.setCPF(dto.getCpf());
        medico.setEndereco(endereco);
        medico.setEspecialidade(dto.getEspecializacao());

        List<Horario> horarios = dto.getHorariosDisponiveis().stream()
                .map(h -> {
                    Horario horario = new Horario();
                    horario.setDataHora(h.getDataHora());
                    horario.setDisponivel(h.getDisponivel());
                    horario.setMedico(medico);
                    return horario;
                }).collect(Collectors.toList());

        medico.setHorariosDisponiveis(horarios);

        return medicoRepository.save(medico);
    }

    @Override
    public Medico findById(Long id) {
        return medicoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Medico> findAll() {
        return medicoRepository.findAll();
    }

    @Override
    public List<Medico> findByEspecialidade(String especialidade) {
        return medicoRepository.findByEspecialidade(especialidade); // Singular, conforme sua entidade
    }
}