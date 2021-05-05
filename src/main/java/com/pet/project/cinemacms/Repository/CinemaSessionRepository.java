package com.pet.project.cinemacms.Repository;

import com.pet.project.cinemacms.Models.CinemaSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaSessionRepository extends JpaRepository<CinemaSession, Long> {
}


