package com.pet.project.cinemacms.Repository;

import com.pet.project.cinemacms.Models.AboutCinema.Advertising;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertisingRepository extends JpaRepository<Advertising, Long> {
}



