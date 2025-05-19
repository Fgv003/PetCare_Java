package com.petCare.Atividade4.controllers;

import com.petCare.Atividade4.entity.Prontuario;
import com.petCare.Atividade4.services.ProntuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/prontuarios")
public class ProntuarioController {

    @Autowired
    private ProntuarioService prontuarioService;

    @PostMapping
    public ResponseEntity<Prontuario> criar(@RequestBody Prontuario prontuario) {
        Prontuario salvo = prontuarioService.save(prontuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }

    @GetMapping("/animal/{animalId}")
    public ResponseEntity<List<Prontuario>> listarPorAnimal(@PathVariable Long animalId) {
        List<Prontuario> prontuarios = prontuarioService.findByAnimalId(animalId);
        return ResponseEntity.ok(prontuarios);
    }
}