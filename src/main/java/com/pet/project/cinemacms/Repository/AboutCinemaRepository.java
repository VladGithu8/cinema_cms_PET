package com.pet.project.cinemacms.Repository;

import com.pet.project.cinemacms.Models.AboutCinema.AboutCinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutCinemaRepository extends JpaRepository<AboutCinema, Long> {
}



