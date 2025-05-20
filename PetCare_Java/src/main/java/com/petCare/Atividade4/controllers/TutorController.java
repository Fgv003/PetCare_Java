package com.petCare.Atividade4.controllers;

import com.petCare.Atividade4.dtos.TutorDTO;
import com.petCare.Atividade4.entity.Tutor;
import com.petCare.Atividade4.services.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tutores")
public class TutorController {

    @Autowired
    private TutorService tutorService;

    @PostMapping
    public ResponseEntity<Tutor> cadastrar(@RequestBody TutorDTO tutor) {
        Tutor salvo = tutorService.save(tutor);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tutor> buscarPorId(@PathVariable Long id) {
        Tutor tutor = tutorService.findById(id);
        return ResponseEntity.ok(tutor);
    }

    @GetMapping
    public ResponseEntity<List<Tutor>> listarTodos() {
        List<Tutor> tutores = tutorService.findAll();
        return ResponseEntity.ok(tutores);
    }
}