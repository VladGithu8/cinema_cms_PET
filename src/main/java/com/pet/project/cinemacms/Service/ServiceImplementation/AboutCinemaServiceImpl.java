package com.pet.project.cinemacms.Service.ServiceImplementation;

import com.pet.project.cinemacms.Models.AboutCinema.AboutCinema;
import com.pet.project.cinemacms.Models.Customer;
import com.pet.project.cinemacms.Service.ServiceInterface.AboutCinemaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutCinemaServiceImpl implements AboutCinemaService {



    @Override
    public List<AboutCinema> getAllAbout() {
        return null;
    }

    @Override
    public void saveAboutCinema(Customer customer) {

    }

    @Override
    public Customer getAboutCinemaByID(Long id) {
        return null;
    }

    @Override
    public void deleteAboutCinemaById(Long id) {

    }
}


