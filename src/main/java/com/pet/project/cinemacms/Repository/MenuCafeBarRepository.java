package com.pet.project.cinemacms.Repository;

import com.pet.project.cinemacms.Models.AboutCinema.MenuCafeBar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuCafeBarRepository extends JpaRepository<MenuCafeBar, Long> {
}




