package com.pet.project.cinemacms.Repository;

import com.pet.project.cinemacms.Models.Movie.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}


