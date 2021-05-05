package com.pet.project.cinemacms.Repository;

import com.pet.project.cinemacms.Models.AboutCinema.CinemaHall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaHallRepository extends JpaRepository<CinemaHall, Long> {
}



