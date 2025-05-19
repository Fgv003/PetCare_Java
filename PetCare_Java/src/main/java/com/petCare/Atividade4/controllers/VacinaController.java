package com.petCare.Atividade4.controllers;

import com.petCare.Atividade4.entity.Vacina;
import com.petCare.Atividade4.services.VacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/vacinas")
public class VacinaController {

    @Autowired
    private VacinaService vacinaService;

    @PostMapping
    public ResponseEntity<Vacina> registrar(@RequestBody Vacina vacina) {
        Vacina salva = vacinaService.save(vacina);
        return ResponseEntity.status(HttpStatus.CREATED).body(salva);
    }

    @GetMapping("/prontuario/{prontuarioId}")
    public ResponseEntity<List<Vacina>> listarPorProntuario(@PathVariable Long prontuarioId) {
        List<Vacina> vacinas = vacinaService.findByProntuarioId(prontuarioId);
        return ResponseEntity.ok(vacinas);
    }
}