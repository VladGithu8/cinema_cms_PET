package com.pet.project.cinemacms.Repository;

import com.pet.project.cinemacms.Models.Movie.Poster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosterRepository extends JpaRepository<Poster, Long> {
}



