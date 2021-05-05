package com.pet.project.cinemacms.Service.ServiceInterface;

import com.pet.project.cinemacms.Models.Cinema;

import java.util.List;

public interface CinemaService {

    void saveCinema(Cinema cinema);

    void deleteCinemaById(Long id);

    Cinema getCinemaById(Long id);

    List<Cinema> getAllCinemasById();


}




