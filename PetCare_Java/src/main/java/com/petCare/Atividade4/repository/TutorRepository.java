package com.petCare.Atividade4.repository;

import com.petCare.Atividade4.entity.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TutorRepository extends JpaRepository<Tutor, Long> {
}
