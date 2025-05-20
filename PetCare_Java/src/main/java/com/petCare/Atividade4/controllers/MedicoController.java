package com.petCare.Atividade4.controllers;

import com.petCare.Atividade4.dtos.MedicoDTO;
import com.petCare.Atividade4.entity.Medico;
import com.petCare.Atividade4.services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @PostMapping
    public ResponseEntity<Medico> cadastrar(@RequestBody MedicoDTO medicoDTO) {
        Medico medicoSalvo = medicoService.save(medicoDTO);
        return new ResponseEntity<>(medicoSalvo, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medico> buscarPorId(@PathVariable Long id) {
        Medico medico = medicoService.findById(id);
        return ResponseEntity.ok(medico);
    }

    @GetMapping("/especialidade/{especialidade}")
    public ResponseEntity<List<Medico>> buscarPorEspecialidade(@PathVariable String especialidade) {
        List<Medico> medicos = medicoService.findByEspecialidade(especialidade);
        return ResponseEntity.ok(medicos);
    }
}