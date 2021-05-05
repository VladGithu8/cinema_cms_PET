package com.pet.project.cinemacms.Repository;

import com.pet.project.cinemacms.Models.Movie.MovieSoon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieSoonRepository extends JpaRepository<MovieSoon, Long> {
}





