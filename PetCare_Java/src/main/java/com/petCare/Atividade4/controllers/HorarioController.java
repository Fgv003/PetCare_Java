package com.petCare.Atividade4.controllers;

import com.petCare.Atividade4.entity.Horario;
import com.petCare.Atividade4.services.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/horarios")
public class HorarioController {

    @Autowired
    private HorarioService horarioService;

    @PostMapping
    public ResponseEntity<Horario> agendar(@RequestBody Horario horario) {
        Horario agendado = horarioService.save(horario);
        return ResponseEntity.status(HttpStatus.CREATED).body(agendado);
    }

    @GetMapping("/medico/{medicoId}")
    public ResponseEntity<List<Horario>> listarPorMedico(@PathVariable Long medicoId) {
        List<Horario> horarios = horarioService.findByMedicoId(medicoId);
        return ResponseEntity.ok(horarios);
    }

    @GetMapping("/disponibilidade")
    public ResponseEntity<Boolean> verificarDisponibilidade(
            @RequestParam LocalDateTime dataHora,
            @RequestParam Long medicoId) {
        boolean disponivel = !horarioService.existsByDataHoraAndMedicoId(dataHora, medicoId);
        return ResponseEntity.ok(disponivel);
    }
}