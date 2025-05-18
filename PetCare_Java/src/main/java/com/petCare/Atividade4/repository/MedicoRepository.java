package com.petCare.Atividade4.repository;

import com.petCare.Atividade4.entity.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {

}
