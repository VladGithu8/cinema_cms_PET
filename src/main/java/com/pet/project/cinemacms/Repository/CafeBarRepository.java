package com.pet.project.cinemacms.Repository;

import com.pet.project.cinemacms.Models.AboutCinema.CafeBar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CafeBarRepository extends JpaRepository<CafeBar, Long> {

}



