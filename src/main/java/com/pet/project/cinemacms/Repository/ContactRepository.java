package com.pet.project.cinemacms.Repository;

import com.pet.project.cinemacms.Models.AboutCinema.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}


