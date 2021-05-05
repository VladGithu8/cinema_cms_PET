package com.pet.project.cinemacms.Repository;

import com.pet.project.cinemacms.Models.AboutCinema.MobileApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileAppRepository extends JpaRepository<MobileApp, Long> {
}




