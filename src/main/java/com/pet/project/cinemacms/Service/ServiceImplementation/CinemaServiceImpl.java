package com.pet.project.cinemacms.Service.ServiceImplementation;

import com.pet.project.cinemacms.Models.Cinema;
import com.pet.project.cinemacms.Repository.CinemaRepository;
import com.pet.project.cinemacms.Service.ServiceInterface.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CinemaServiceImpl implements CinemaService {

    @Autowired
    private CinemaRepository cinemaRepository;

    @Override
    public void saveCinema(Cinema cinema) {
        this.cinemaRepository.save(cinema);

    }

    @Override
    public void deleteCinemaById(Long id) {
        this.cinemaRepository.deleteById(id);
    }

    @Override
    public Cinema getCinemaById(Long id) {
        Optional<Cinema> cinemaOptional = cinemaRepository.findById(id);
        Cinema cinema;
        if(cinemaOptional.isPresent()){
            cinema = cinemaOptional.get();
        } else{
            throw new RuntimeException("Cinema not found by id: " + id);
        }
        return cinema;
    }

    @Override
    public List<Cinema> getAllCinemasById() {
        return cinemaRepository.findAll();
    }
}


