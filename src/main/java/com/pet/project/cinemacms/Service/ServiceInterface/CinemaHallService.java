package com.pet.project.cinemacms.Service.ServiceInterface;

import com.pet.project.cinemacms.Models.AboutCinema.CinemaHall;

import java.util.List;

public interface CinemaHallService {

    void saveCinemaHall(CinemaHall cinemaHall);

    void deleteCinemaHallById(Long id);

    CinemaHall getCinemaHallById(Long id);

    List<CinemaHall> getAllCinemaHallsById();

}




