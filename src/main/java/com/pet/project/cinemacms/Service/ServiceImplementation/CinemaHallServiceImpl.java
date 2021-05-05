package com.pet.project.cinemacms.Service.ServiceImplementation;

import com.pet.project.cinemacms.Models.AboutCinema.CinemaHall;
import com.pet.project.cinemacms.Service.ServiceInterface.CinemaHallService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaHallServiceImpl implements CinemaHallService {





    @Override
    public void saveCinemaHall(CinemaHall cinemaHall) {

    }

    @Override
    public void deleteCinemaHallById(Long id) {

    }

    @Override
    public CinemaHall getCinemaHallById(Long id) {
        return null;
    }

    @Override
    public List<CinemaHall> getAllCinemaHallsById() {
        return null;
    }
}



