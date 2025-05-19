package com.petCare.Atividade4.controllers;

import com.petCare.Atividade4.entity.Animal;
import com.petCare.Atividade4.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @PostMapping
    public ResponseEntity<Animal> criar(@RequestBody Animal animal) {
        Animal animalSalvo = animalService.save(animal);
        return ResponseEntity.status(HttpStatus.CREATED).body(animalSalvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Animal> buscarPorId(@PathVariable Long id) {
        Animal animal = animalService.findById(id);
        return ResponseEntity.ok(animal);
    }

    @GetMapping
    public ResponseEntity<List<Animal>> listarTodos() {
        List<Animal> animais = animalService.findAll();
        return ResponseEntity.ok(animais);
    }

    @GetMapping("/tutor/{tutorId}")
    public ResponseEntity<List<Animal>> listarPorTutor(@PathVariable Long tutorId) {
        List<Animal> animais = animalService.findByIdTutor(tutorId);
        return ResponseEntity.ok(animais);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        animalService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}