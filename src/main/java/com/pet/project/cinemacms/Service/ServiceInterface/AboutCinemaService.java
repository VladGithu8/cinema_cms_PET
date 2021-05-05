package com.pet.project.cinemacms.Service.ServiceInterface;

import com.pet.project.cinemacms.Models.AboutCinema.AboutCinema;
import com.pet.project.cinemacms.Models.Customer;

import java.util.List;

public interface AboutCinemaService {

    List<AboutCinema> getAllAbout();

    void saveAboutCinema(Customer customer);

    Customer getAboutCinemaByID(Long id);

    void deleteAboutCinemaById(Long id);
}



