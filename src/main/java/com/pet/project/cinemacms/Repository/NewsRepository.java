package com.pet.project.cinemacms.Repository;

import com.pet.project.cinemacms.Models.AboutCinema.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}



