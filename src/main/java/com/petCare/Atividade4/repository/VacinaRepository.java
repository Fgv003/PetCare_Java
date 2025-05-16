package com.petCare.Atividade4.repository;

import com.petCare.Atividade4.entity.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacinaRepository extends JpaRepository<Vacina, Long> {
}
